package com.betulkircil.methodsandclasses;

import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int index = 0;
        boolean isFound = false;
        int[] sayilar = new int[]{34, 54, 67, 87, 8, 45, 37, 76};
        System.out.println("Please enter a number you wanna search");
        int number = input.nextInt();
        for(int k = 0; k<sayilar.length; k++){
            if(sayilar[k] == number){
                isFound = true;
                index = k;
                break;
            }
        }
        if(isFound){
            System.out.println("The number you've searched is found at " + index + ".index");
        }
        else {
            System.out.println("The number you've searcheed is not found at any index");
        }
    }
}
