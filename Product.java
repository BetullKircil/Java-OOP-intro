package com.betulkircil.constructors;

public class Product {
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;
    private String urunKodu;

    public Product(String name, String description, double price, int stockAmount, int id){
        System.out.println("Yapici blok calisti");
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.id = id;
        this.urunKodu = name.substring(0,1) + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunKodu() {
        return urunKodu;
    }
}
