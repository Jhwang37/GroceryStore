package com.CreateFile;

import java.util.HashMap;
import java.util.Scanner;

public class Store {
    static Scanner scan = new Scanner(System.in);
    final double importTax = .05, regTax = .10;
    static double price, totalTax, totalPrice;
    static String item;
    static HashMap<String, Double> cart = new HashMap<String, Double>();

    public Store() {
        System.out.println("Enter Item: ");
        item = scan.nextLine();
        System.out.println("Enter price: ");
        price = scan.nextDouble();
        cart.put(item, price);
        System.out.println(cart);
    }

    public double whatTax(){
        if(cart.containsValue("import")){
            totalTax = importTax * price;
        }

    }
}

