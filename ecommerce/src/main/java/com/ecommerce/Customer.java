package com.ecommerce;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public void checkout(){
        if (cart.isEmpty()) throw new IllegalStateException("Cart is empty.");
        double subtotal = 0;
        double shippingCost = 0;
        List<Shippable> toShip=new ArrayList<>();

        for(Map.Entry<Product, Integer> entry: cart.entrySet()){
            Product p=entry.getKey();
            int qnt=entry.getValue();
            
            if(p.isExpired()) throw new IllegalStateException(p.getName() + " is expired.");
            if(qnt >p.getAvailQnt())throw new IllegalStateException(p.getName() +" out of stock.");

            subtotal+=p.getPrice()*qnt;
            if(p instanceof Shippable s){
                for(int i=0;i<qnt;i++){
                    toShip.add(s);
                    shippingCost+=9.75;
                }
            }
        }
        double total=shippingCost+subtotal;
        if(balance<total)throw new IllegalStateException("Insufficient balance.");
        balance -= total;
        ShippingService.ship(toShip);
        for(Map.Entry<Product,Integer> e:cart.entrySet()){
            e.getKey().reduceQnt(e.getValue());
        }

        System.out.println("** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.printf("%dx %s\t%.0f\n", entry.getValue(), entry.getKey().getName(), entry.getKey().getPrice() * entry.getValue());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal\t%.0f\n", subtotal);
        System.out.printf("Shipping\t%.0f\n", shippingCost);
        System.out.printf("Amount\t\t%.0f\n", total);
        System.out.printf("Balance left\t%.0f\n", balance);

        cart.clear();
    }

        public double getBalance() { return balance; }

}
