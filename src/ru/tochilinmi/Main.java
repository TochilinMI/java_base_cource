package ru.tochilinmi;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("text.txt");
        String context = reedFile();
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            System.out.println("Write some text");
            Scanner in = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(file);
            context += reedFile() + in.nextLine();
            pw.println(context);

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print(reedFile());
    }
    public static String reedFile(){
        BufferedReader br = null;
        String line, result = "";
        try {
            br = new BufferedReader(new FileReader("text.txt"));
            while ((line = br.readLine())!= null)result+=line+"\n";
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
