package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Fixture {
    private List<String> teams = new ArrayList<>();
    private final int ROUND_NUMBER;
    private final int MATCH_PER;
    private final Scanner scanner = new Scanner(System.in);
    public Fixture() {
        this.teams = listeOlustur(teams);
        this.ROUND_NUMBER = (this.teams.size()-1) * 2;
        this.MATCH_PER = this.teams.size()/2;
    }
    public void run(){
        match();
    }
    public void match(){
        for (int i=1; i<=this.ROUND_NUMBER/2; i++){
            System.out.println("ROUND " + i);
            for (int j=0; j<this.MATCH_PER; j++){
                System.out.println(this.teams.get(j) + " vs " + this.teams.get(this.teams.size()-j-1));
            }
            Collections.rotate(this.teams.subList(1,this.teams.size()),1);
        }
        for (int i=(this.ROUND_NUMBER/2)+1; i<=this.ROUND_NUMBER; i++){
            System.out.println("ROUND " + i);
            for (int j=0; j<this.MATCH_PER; j++){
                System.out.println(this.teams.get(this.teams.size()-j-1) + " vs " + this.teams.get(j));
            }
            Collections.rotate(this.teams.subList(1,this.teams.size()),1);
        }
    }
    public List<String> listeOlustur(List<String> teams){
        System.out.println("==========FİKSTÜR==========");
        System.out.print("Kaç Takım gireceksiniz: ");
        int teamNumber = scanner.nextInt();
        if (teamNumber%2 == 0 && teamNumber >= 2){
            for (int i=1; i<=teamNumber; i++){
                System.out.print(i + ". takım ismi: ");
                String teamName = scanner.next();
                teams.add(teamName);
            }
        } else if (teamNumber%2 != 0 && teamNumber >= 2) {
            for (int i=1; i<=teamNumber; i++){
                System.out.print(i + ". takım ismi: ");
                String teamName = scanner.next();
                teams.add(teamName);
            }
            teams.add("Bay");
        } else{
            System.out.println("Lütfen 2 takımdan az takım sayısı girmeyiniz...");
        }
        return teams;
    }
}
