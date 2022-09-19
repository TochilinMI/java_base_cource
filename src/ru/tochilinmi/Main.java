package ru.tochilinmi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printSome(10,"th");
        printSome(2);
        printSome(sum(1,2));

        String[] words = new String[3];
        makeArr(words);
        makeArr(words);
        makeArr(words);
    }
    // if returnless -> void
    // else data type
    public static String[] makeArr(String[] arr){   // Get array
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter "+i+" element:");
            arr[i] = in.nextLine();                 // push array
        }
        return arr;                                 // return array
    }

    public static void printSome(int some, String at){
        System.out.println("Hello "+some+at+" world!");
    }
    public static void printSome(int some){
        System.out.println("Only data: "+some);
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
