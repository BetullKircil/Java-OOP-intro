package com.betulkircil.methodsandclasses;

import java.util.Locale;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double bakiye = 7856.99;
        String cevap;
        double miktar = 0;
        
        System.out.println("Bankamıza hosgeldiniz");
        System.out.println("lutfen yapmak istediginiz islemi seciniz");
        System.out.println("1-Bakiye goruntuleme");
        System.out.println("2-Para cekme");
        System.out.println("3-Para yatirma");
        System.out.println("4-Cikis");
        int islem = input.nextInt();
        while (islem != 4){
            if(islem == 1){
                bakiyeGoster(bakiye);
                islemSor();
                cevap = input.nextLine().toUpperCase(Locale.ROOT);
                if(cevap == "EVET"){
                    System.out.println("Lutfen yapmak istediginiz islemi giriniz: ");
                    islem = input.nextInt();
                    islemeYonlendir(islem, bakiye, miktar);
                }else {
                    System.out.println("Ana ekrana yonlendiriliyorsunuz.");
                    break;
                }
            }
            else if(islem == 2){
                System.out.println("Cekmek istediginiz miktari giriniz lutfen");
                miktar = input.nextDouble();
                paraCek(miktar, bakiye);
                islemSor();
                cevap = input.nextLine().toUpperCase(Locale.ROOT);
                if(cevap == "EVET"){
                    System.out.println("Lutfen yapmak istediginiz islemi giriniz");
                    islem = input.nextInt();
                    islemeYonlendir(islem, bakiye, miktar);
                }
                else{
                    System.out.println("Ana ekrana yonlendiriliyorsunuz.");
                    break;
                }
            }
            else if(islem == 3){
                System.out.println("Yatirmak istediginiz miktari yatiriniz:");
                miktar = input.nextDouble();
                paraYatir(miktar, bakiye);
                islemSor();
                cevap = input.nextLine().toUpperCase(Locale.ROOT);
                if(cevap == "EVET"){
                    System.out.println("Lutfen yapmak istediginiz islemi giriniz");
                    islem = input.nextInt();
                    islemeYonlendir(islem, bakiye, miktar);
                }
                else{
                    System.out.println("Ana ekrana yonlendiriliyorsunuz.");
                }
            }
            else if(islem == 4){
                System.out.println("Sistemden cikis yapiliyor");
                break;
            }
            else {
                System.out.println("Yanlis giris yaptiniz...Tekrar deneyiniz");
            }
        }

    }
    public static void islemSor(){
        System.out.println("Baska bir islem yapmak ister misiniz");
    }
    
    public static void bakiyeGoster(double bakiye){
        System.out.println("Bakiyeniz: " + bakiye);
    }
    
    public static void paraCek(double miktar, double bakiye){
        if(miktar <= bakiye){
            bakiye-= miktar;
            System.out.println("Yeni bakiyeniz:" + bakiye);
        }
        else {
            System.out.println(bakiye);
            System.out.println("Bakiyeniz yetersiz");
        }
    }
    
    public static void paraYatir(double miktar, double bakiye){
        bakiye+=miktar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }
    
    public static void islemeYonlendir(int islem, double bakiye, double miktar){
        if(islem == 1){
            bakiyeGoster(bakiye);
        }
        else if(islem == 2){
            paraCek(miktar, bakiye);
        }
        else if(islem == 3){
            paraYatir(miktar, bakiye);
        }
        else if(islem == 4){
            System.out.println("Cikis yapiliyor");
        }
        else{
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}

    
