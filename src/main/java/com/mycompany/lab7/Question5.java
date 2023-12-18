
package com.mycompany.lab7;

import java.io.*;

public class Question5 {
    
    public static void main(String[] args) {
        
        try{
            // remember to change the file path
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("/Users/zhengwei/Desktop/sem 1/wix1002/week 9/Lab07/person.dat"));
        
        // store the number of record in the person.dat
        int numberOfRecord = sc.readInt();
        
        // create array for storing each value
        String[] name = new String[numberOfRecord];
        int[] age = new int[numberOfRecord];
        char[] gender = new char[numberOfRecord];
        
        // store each person record into array
        for(int i=0; i<numberOfRecord; i++) {
            name[i] = sc.readUTF();
            age[i] = sc.readInt();
            gender[i] = sc.readChar();
        }
        
        // use bubble sort to sort the name in ascending order
        for(int i = 0; i < numberOfRecord - 1; i++) {
            for(int j = 0; j < numberOfRecord - i - 1; j++) {
                if(name[j].compareToIgnoreCase(name[j+1]) > 0) {
                    
                    String tempS = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tempS;
                    
                    int tempA = age[j];
                    age[j] = age[j+1];
                    age[j+1] = tempA;
                    
                    char tempG = gender[j];
                    gender[j] = gender[j+1];
                    gender[j+1] = tempG;
                }
            }
        }
        
        // display all the record
        for(int i = 0; i < numberOfRecord; i++) {
            System.out.println(name[i] + " " + age[i] + " " + gender[i]);
        }
            
            
        sc.close();
        
        } catch (IOException e) {
            System.out.println("As a programmer, encounter error is normal");
            e.printStackTrace();
        }
    }
}
