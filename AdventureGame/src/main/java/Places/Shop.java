package Places;

import Characters.Charact;
import Guns.*;
import Armors.*;
import java.util.Scanner;
public class Shop {
    private Scanner scanner = new Scanner(System.in);
    private String guns = "===Guns===\n" +new Gun().toString() +"\n"+new Blade().toString() +"\n"+ new Rifle().toString();
    private String armors = "===Armors===\n" +new LowArmor().toString()+"\n"+ new MidArmor().toString()+"\n"+new HighArmor().toString();
    public void buy(Charact c) throws InterruptedException {
        System.out.println("====MAĞAZAYA HOŞGELDİNİZ====");
        System.out.println("Hoşgeldin " + c.getName());
        System.out.println("Info: " + c);
        showInfo();
        boolean isFinished =true;
        while (isFinished){
            int select = scanner.nextInt();
            if (select == 1){
                System.out.println(this.guns);
                System.out.println("Ana menu için => 4");
                System.out.print("Lütfen almak istediğiniz techizatın(GUNS) id'sini giriniz: ");
                int gunsSelect = scanner.nextInt();
                Thread.sleep(2000);
                if (gunsSelect == 1){
                    gunsIfBlockInfo(c,25,2);
                    return;
                }else if (gunsSelect == 2){
                    gunsIfBlockInfo(c,35,3);
                    return;
                } else if (gunsSelect == 3) {
                    gunsIfBlockInfo(c,45,7);
                    return;
                } else if (gunsSelect == 4) {
                    showInfo();
                    return;
                }
            } else if (select == 2) {
                System.out.println(this.armors);
                System.out.println("Ana menu için => 4");
                System.out.print("Lütfen almak istediğiniz techizatın(ARMORS) id'sini giriniz: ");
                int armorsSelect = scanner.nextInt();
                Thread.sleep(2000);
                if (armorsSelect == 1){
                    armorsIfBlockInfo(c,15,1);
                    return;
                }else if (armorsSelect == 2){
                    armorsIfBlockInfo(c,25,3);
                    return;
                } else if (armorsSelect == 3) {
                    armorsIfBlockInfo(c,40,5);
                    return;
                } else if (armorsSelect == 4) {
                    showInfo();
                    return;
                }
            } else if (select == 0) {
                System.out.println("Tekrar bekleriz.");
                System.out.println("Mağazadan çıkış yapılıyor...");
                Thread.sleep(2000);
                isFinished = false;
            }else {
                System.out.println("Yanlş bir input sağladınız. Lütfen tekrar deneyiniz...");
            }
        }
    }
    public void gunsIfBlockInfo(Charact c, int num1, int num2) throws InterruptedException {
        if (c.getCash() >= num1){
            c.setCash(c.getCash() - num1);
            c.setDamage(c.getDamage() + num2);
            System.out.println("Satın alma gerçekleştirilmiştir");
            System.out.println(c.getName() + "'ın yeni hasar derecesi: " + c.getDamage() + " ve kalan parası: " + c.getCash());
        }else {
            System.out.println("BAKİYE YETERSİZ!");
            System.out.println("Mağazadan çıkış yapılıyor...");
            Thread.sleep(2000);
        }
    }
    public void armorsIfBlockInfo(Charact c, int num1, int num2) throws InterruptedException {
        if (c.getCash() >= num1){
            c.setCash(c.getCash() - num1);
            c.setHealth(c.getHealth() + num2);
            System.out.println("Satın alma gerçekleştirilmiştir");
            System.out.println(c.getName() + "'ın yeni sağlığı: " + c.getHealth() + " ve kalan parası: " + c.getCash());
        }else {
            System.out.println("BAKİYE YETERSİZ!");
            System.out.println("Mağazadan çıkış yapılıyor...");
            Thread.sleep(2000);
        }
    }
    public void showInfo(){
        System.out.println(this.guns);
        System.out.println(this.armors);
        System.out.println("Çıkış yapmak için => 0");
        System.out.print("Lütfen satın almak istediğiniz techizat grubunun id'sini giriniz(Guns => 1 or Armors => 2): ");
    }
}