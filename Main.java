package com.betulkircil.constructors;

public class Main {
    public static void main(String[] args){
        DortIslem dortIslem = new DortIslem();
        int result = dortIslem.add(2, 3);
        System.out.println("Sonuc: " + result);
        result = dortIslem.add(2, 3, 4);
        System.out.println("2.Sonuc: " + result);
    }
}
