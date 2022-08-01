/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

/**
 *
 * @author shahidur
 */
public class Test {
    public static void main(String[] args) {
        Double d[]={new Double(4),new Double(5)}; 
        //int i[]={4,5};
        addValues(d);
        System.out.println("Hello  "+addValues(d));
    }
    //  Double d[]={new Double(4),new Double(5)}; 
    // System.out.println("Hello  "+addValues(d));

    public static Double addValues(Double[] values) {
        // return the total
        Double sum = new Double(0);
        for (int i = 0; i < values.length; i++) {
            sum += values[i];

        }
        if (sum == null) {
            return null;
        } else {
            return sum;
        }
    }
}
