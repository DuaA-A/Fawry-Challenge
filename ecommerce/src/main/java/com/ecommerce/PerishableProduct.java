package com.ecommerce;

import java.time.LocalDate;

public class PerishableProduct extends Product{
    private LocalDate expDate;
    
    public PerishableProduct(String name, double price, int qnt, LocalDate exDate){
        super(name, price, qnt);
        this.expDate = exDate;
    }

    @Override
    public boolean isExpired(){
        return LocalDate.now().isAfter(expDate);
    }
}
