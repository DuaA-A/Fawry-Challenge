package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ali", 600);

        Product cheese = new ShippableProduct("Cheese", 100, 10, 0.2);
        Product biscuits = new ShippableProduct("Biscuits", 150, 5, 0.7);
        Product scratchCard = new Product("ScratchCard", 50, 20) {};

        customer.addToCart(cheese, 2);
        customer.addToCart(biscuits, 1);
        customer.addToCart(scratchCard, 1);

        customer.checkout();
    }
}