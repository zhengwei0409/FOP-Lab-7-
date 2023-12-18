
package com.mycompany.lab7;

import java.util.*;
import java.io.*;

public class Question4 {
    
    public static void main(String[] args) {
        
        int lineCount = 0;
        int characterCount = 0;
        int wordsCount = 0;
        
        try{
            
        Scanner sc = new Scanner(new FileInputStream("text.txt"));
        
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            // store each word into an array
            String[] arr = str.split(" ");
            wordsCount += arr.length;
            // count the number of character of each word
            for(int i = 0; i < arr.length; i++) {
                characterCount += arr[i].length();
            }
            lineCount++;
        }
        
        // display 
            System.out.println("Number of lines : " + lineCount);
            System.out.println("Number of Characters : " + characterCount);
            System.out.println("Number of Words : " + wordsCount);
        
        } catch (IOException e) {
            System.out.println("Errorr love you");
        }
    }
}
