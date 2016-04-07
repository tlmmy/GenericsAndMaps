/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author trogers8
 */
public class BikeByManufacturer implements Comparator<Bike> {

    @Override
    public int compare(Bike b1, Bike b2) {
  return new CompareToBuilder()
               .append(b1.getManufacturer(), b2.getManufacturer())
               .toComparison();
       
    }
    
}
