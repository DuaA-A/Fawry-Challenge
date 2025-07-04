package com.ecommerce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShippingService {
    public static void ship(List<Shippable> items){
        System.out.println("** Shipment notice **");
        double totalWeight =0;
        Map<String, Integer> cntMap = new HashMap<>();
        Map<String, Double> weightMap = new HashMap<>();
        
        for(Shippable item :items){
            cntMap.put(item.getName(),cntMap.getOrDefault(item.getName(), 0) + 1);
            weightMap.put(item.getName(), item.getWeight());
            totalWeight += item.getWeight();
        }
        int cnt;
        for(String name : cntMap.keySet()){
            cnt=cntMap.get(name);
            double wt =weightMap.get(name)*cnt;
            System.out.printf("%dx %s\t%.0fg\n", cnt, name, wt * 1000);
        }
        System.out.printf("Total package weight %.1fkg\n", totalWeight);
    }
}
