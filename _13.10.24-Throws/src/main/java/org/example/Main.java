package org.example;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws Exception{
        if (age < 18){
            throw new AgeCheckException("Yaşınız tutmuyor!!!");
            //throw new Exception("Yaşınız tutmuyor"); agecheck sınıfı oluşturulmadan önce kullanılıyordu.
        }
        System.out.println("Yaşı uygundur!");
    }
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        /*
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşı uymadı !");
            System.out.println(e.toString());
        }
         */
        checkAge(age);

        System.out.println("Program Bitti!");

    }
}