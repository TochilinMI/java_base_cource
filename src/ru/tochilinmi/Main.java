package ru.tochilinmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Put your age");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age < 18){
            System.out.println("Too yong");
        } else if(age == 18) {
            System.out.println("Your are 18th");
        } else {
            System.out.println("Your are older then 18th");
        }
    }
}
