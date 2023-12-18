
package com.mycompany.lab7;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Question2 {
    
    public static void main(String[] args) {
        try {
            // connect to the url
            // remember to change the url same as below
            // url given by the question is wrong
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            // create a file index.htm 
            PrintWriter file = new PrintWriter(new FileOutputStream("index.htm"));
            
            // read and write the html code in the url given to the file
            while(in.hasNextLine()) {
                file.println(in.nextLine());
            }
            
            in.close();
            file.close();
            
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
