package com.ecommerce;

public class ShippableProduct extends Product implements Shippable{
    private final double weight;

    public ShippableProduct(String name, double price, int qnt, double weight){
        super(name, price, qnt);
        this.weight=weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}
