
package com.mycompany.lab7;

import java.util.*;
import java.io.*;

public class Question6 {
    
    public static void main(String[] args) {
        try{
            
        Scanner order = new Scanner(new FileInputStream("/Users/zhengwei/Desktop/sem 1/wix1002/week 9/Lab07/order.txt"));
        
        String orderProductID, productID, productName;
        int orderQuantity;
        double pricePerUnit, total;
        
        System.out.printf("%-9s %-20s %-8s %-12s %-10s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
        while(order.hasNextLine()) {
            // create an array to store the order
            String[] arrO = order.nextLine().split(",");
            
            orderProductID = arrO[1];
            orderQuantity = Integer.parseInt(arrO[2]);
            
            // reset product.hasNextLine() after the loop
            Scanner product = new Scanner(new FileInputStream("/Users/zhengwei/Desktop/sem 1/wix1002/week 9/Lab07/product.txt"));
            
            while(product.hasNextLine()) {
                String[] arrP = product.nextLine().split(",");
                
                productID = arrP[0];
                
                // compare the order and product
                if(orderProductID.equals(productID)) {
                    productName = arrP[1];
                    pricePerUnit = Double.parseDouble(arrP[2]);
                    total = orderQuantity * pricePerUnit;
                    
                    System.out.printf("%-9s %-20s %-8d %-12.2f %-10.2f\n", productID, productName, orderQuantity, pricePerUnit, total);
                    break;
                }      
            }
            product.close();
        }
        
        order.close();
        
        
        } catch (IOException e) {
            System.out.println("Error will make you stronger");
        }
    }
}
