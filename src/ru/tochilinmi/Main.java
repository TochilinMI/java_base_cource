package ru.tochilinmi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("text.txt");

        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                System.err.println("---------------------------------");
                e.printStackTrace();
                System.err.println("---------------------------------");
            }
        }
        try {
            System.out.println("Write some text");
            Scanner in = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(file);

                pw.println(in.nextLine());

            pw.close();
        } catch (FileNotFoundException e) {
            System.err.println("---------------------------------");
            e.printStackTrace();
            System.err.println("---------------------------------");
        }



    }
}
