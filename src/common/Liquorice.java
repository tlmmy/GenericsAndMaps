/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Objects;

/**
 *
 * @author trogers8
 */
public class Liquorice {
    private String color;
    private String flavor;
    private String barcode;
    
    public Liquorice(String color, String flavor) {
        this.color = color;
        this.flavor = flavor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.barcode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Liquorice other = (Liquorice) obj;
        if (!Objects.equals(this.barcode, other.barcode)) {
            return false;
        }
        return true;
    }

 
    
    
}
