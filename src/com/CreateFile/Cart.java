package com.CreateFile;

public class Cart extends Store {

    public static double getTotal(double price, double importTax, double tax){
        double total = price + (price * tax);
        return total;
    }

}
