package ru.tochilinmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Put your num");
        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();

        switch (num){
            case 1:
                System.out.println("Variable's equal 1");
                break;
            case 23:
                System.out.println("Variable's equal 23");
                break;
            default:
                System.out.println("Not in case");
                break;
        }

    }
}
