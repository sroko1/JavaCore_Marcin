package com.revature;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q20 {

    public static void main(String[] args) throws IOException {


         final String FILE_NAME = "Data.txt";
        final String CHAR = ":";

        BufferedReader br = null;
        try {


        br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(CHAR);
            System.out.println("Name: "  + words[0] + " " + words[1]);
            System.out.println("Age: "  + words[2] + " years");
            System.out.println("State: "  + words[3] + " State ");
            System.out.println("\n");
        }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null) {
                br.close();
            }
        }
    }
}
