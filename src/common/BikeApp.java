/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author trogers8
 */
public class BikeApp {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Schwinn", "9999");
        Bike bike2 = new Bike("Trek", "1234");
        Bike bike3 = new Bike("Schwinn", "2345");
        
        if(bike1.equals(bike2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
                }
    
    
    Set<Bike> bikes = new TreeSet<>();
    bikes.add(bike1);
    bikes.add(bike2);
    bikes.add(bike3);
    
        System.out.println("by serial num");
    for(Bike b : bikes) {
            System.out.println(b);
        }
    
    
    List<Bike> bikeList = new ArrayList<>();
    bikeList.add(bike1);
    bikeList.add(bike2);
    bikeList.add(bike3);
    Collections.sort(bikeList, new BikeByManufacturer());
        System.out.println("by manufacturer");
    for(Bike b : bikeList){
        System.out.println(b);
    }
    
    System.out.println("array of bike sorted by default");
    Bike[] bikeArray = {bike1, bike2};
    Arrays.sort(bikeArray);
    
    
    
    
    
}
}
