package com.ecommerce;
import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private double balance;
    private Map<Product, Integer> cart = new HashMap<>();

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void addToCart(Product p, int qnt){
        
        if(qnt<=0 || qnt >p.getAvailQnt())
            throw new IllegalArgumentException("Invalid qunatity.");
        
        cart.merge(p, qnt, Integer::sum);
    }

    public Map<Product, Integer> getCArt(){
        return cart;
    }
}
