package com.betulkircil.methodsandclasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int sonuc;
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Islemler...");
        System.out.println("1-Topla");
        System.out.println("2-Cikar");
        System.out.println("3-Carp");
        System.out.println("4-Bol");
        System.out.println("*****************");
        System.out.println("Lutfen iki sayi giriniz:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("Lutfen yapmak istediginiz islemi giriniz");
        int islem = input.nextInt();
        if(islem == 1){
            sonuc = calculator.Topla(number1, number2);
            System.out.println("Sonuc: " + sonuc);
        }
        else if(islem == 2){
            sonuc = calculator.Cikar(number1, number2);
            System.out.println("Sonuc: " + sonuc);
        }
        else if(islem == 3){
            sonuc = calculator.Carp(number1, number2);
            System.out.println("Sonuc: " + sonuc);
        }
        else if(islem == 4){
            double bolmeSonuc = calculator.Bol(number1, number2);
            System.out.println("Sonuc: " + bolmeSonuc);
        }
        else{
            System.out.println("Yanlis deger girdiniz");
        }
    }
}
