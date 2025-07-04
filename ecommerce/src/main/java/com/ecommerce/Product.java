package com.ecommerce;

public class Product {
    protected  String name;
    protected double price;
    protected  int qnt;

    public Product(String name, double price, int qnt){
        this.name=name;
        this.price = price;
        this.qnt= qnt;
    }
    public int getAvailQnt(){
        return this.qnt;
    }
    public boolean isShippable(){
        return this instanceof Shippable;
    }
    public boolean isExpired(){
        return false;
    }
    public void reduceQnt(int amnt){
        qnt -= amnt;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
}
