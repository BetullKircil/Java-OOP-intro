package com.betulkircil.constructors;

public class Main {
    public static void main(String[] args){
        Product product = new Product("Kalem","Kaliteli kalem", 56.99, 1000, 04);
        System.out.println(product.getUrunKodu());
        System.out.println(product.getDescription());
        System.out.println( product.getName());
        System.out.println(product.getId());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
    }
}
