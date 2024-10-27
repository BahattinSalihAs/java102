package org.example;

import Characters.*;
import Places.*;
import java.util.*;
public class Game {
    private final List<Places> selects = new ArrayList<>();
    private final Cave cave = new Cave();
    private final Forest forest = new Forest();
    private final River river = new River();
    Scanner scanner = new Scanner(System.in);
    private Charact charact;
    private final String characters = new Samurai().toString() + "\n" + new Archer().toString() + "\n" + new Knight().toString();
    private final String places2 = "Dikkatli ol(1-3) adet zombi gelir.(Mağara) için => 1" + "\n" + "Dikkatli ol(1-3) adet vampir gelir.(Orman) için => 2" +
            "\n" + "Dikkatli ol(1-3) adet ayı gelir.(Nehir) için => 3" + "\n" + "Güvenli Ev için => 4\n" + "Mağaza için => 5";
    public void run() throws InterruptedException {
        boolean isWin = true;
        selectCharacter();
        while (isWin){
            placeToTravel();
            Thread.sleep(5000);
            System.out.println(this.charact);
            if (this.charact.getHealth() <= 0){
                isWin = false;
            }
            Thread.sleep(2000);
        }
    }
    public void selectCharacter() throws InterruptedException {
        boolean isFinished = false;
        while (!isFinished){
            System.out.println("==========KARAKTERLER==========");
            System.out.println(characters);
            System.out.print("Lütfen seçmek istediğiniz karakterin id'sini giriniz: ");
            int selectCharact = scanner.nextInt();
            if (selectCharact == 1){
                this.charact = new Samurai();
                isFinished = true;
            } else if (selectCharact == 2) {
                this.charact = new Archer();
                isFinished = true;
            } else if (selectCharact == 3) {
                this.charact = new Knight();
                isFinished = true;
            }else {
                System.out.println("Yanlış seçim. Tekrar deneyiniz...");
                Thread.sleep(1000);
            }
        }
    }
    public void placeToTravel() throws InterruptedException {
        boolean isFinished = false;
        System.out.println("==========BÖLÜMLER==========");
        System.out.println(places2);
        System.out.print("Lütfen gitmek istediğiniz bölgeyi seçin: ");
        while (!isFinished){
            int selectPlace = scanner.nextInt();
            if (selectPlace == 1){
                if (this.selects.contains(this.cave)){
                    System.out.println("Bu bölüm zaten geçildi başka bölümler seç " + this.charact.getName());
                    return;
                }
                this.cave.war(this.charact);
                this.selects.add(this.cave);
                isFinished = true;
            } else if (selectPlace == 2) {
                if (this.selects.contains(this.forest)){
                    System.out.println("Bu bölüm zaten geçildi başka bölümler seç " + this.charact.getName());
                    return;
                }
                this.forest.war(this.charact);
                selects.add(this.forest);
                isFinished = true;
            } else if (selectPlace == 3) {
                if (this.selects.contains(this.river)){
                    System.out.println("Bu bölüm zaten geçildi başka bölümler seç " + this.charact.getName());
                    return;
                }
                this.river.war(this.charact);
                this.selects.add(this.river);
                isFinished = true;
            } else if (selectPlace == 4) {
                SafetyHouse safety = new SafetyHouse();
                safety.safe(this.charact);
                isFinished = true;
            } else if (selectPlace == 5) {
                Shop shop = new Shop();
                shop.buy(this.charact);
                isFinished = true;
            }else {
                System.out.println("Yanlış seçim. Lütfen tekrar deneyiniz...");
                return;
            }
        }
    }
}