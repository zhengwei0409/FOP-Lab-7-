package com.mycompany.lab7;

import java.io.*;
import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        try {
        
        // write to the file
        ObjectOutputStream fileIn = new ObjectOutputStream(new FileOutputStream("course.dat"));
        
        fileIn.writeUTF("WXES1116,Programming I");
        fileIn.writeUTF("WXES1115,Data Structure");
        fileIn.writeUTF("WXES1110,Operating System");
        fileIn.writeUTF("WXES1112,Computing Mathematics I");
       
        fileIn.close();
        
        // read from the file
        ObjectInputStream fileOut = new ObjectInputStream(new FileInputStream("course.dat"));
        
        // prompt user to enter couse code
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course number: ");
        String course = sc.next();
        
        try {
            while(true) {
                // store the course information in an array
                // arr[0] = course code
                // arr[1] = course name
                String[] arr = fileOut.readUTF().split(",");
                
                // compare the user entered course number with arr[0]
                if (arr[0].equals(course)) {
                    System.out.println("Course name : " + arr[1]);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Course Not Found");
            fileOut.close();
        }
        
        
        fileOut.close();
        
        } catch (IOException e) {
            System.out.println("Errrorrrorrororor");
        }
    }
}
