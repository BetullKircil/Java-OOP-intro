package com.betulkircil.methodsandclasses;

public class Calculator {
    public int Topla(int number1, int number2){
        return number1+number2;
    }
    public int Cikar(int number1, int number2){
        return number1-number2;
    }
    public double Bol(int number1, int number2){
        if(number2 != 0) {
            return number1 / number2;
        }
        return 0;
    }
    public int Carp(int number1, int number2){
        return number1*number2;
    }

}
