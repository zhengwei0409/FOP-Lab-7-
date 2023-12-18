
package com.mycompany.lab7;

import java.util.*;
import java.io.*;

public class Question3 {
    
    public static void main(String[] args) {
        
        try{
            
            Scanner sc = new Scanner(new FileInputStream("text.txt"));
            PrintWriter wr = new PrintWriter(new FileOutputStream("reverse.txt"));
            
            // scan through each line
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                // write the reverse string into the reverse.txt
                for(int i = line.length() - 1; i >= 0; i--) {
                    char c = line.charAt(i);
                    wr.print(c);
                }
                // add a new line after writing a line
                wr.print("\n");
            }
            
            sc.close();
            wr.close();
        } catch (IOException e) {
            System.out.println("Errrrorrorororororrorororor");
        }
    }  
}
