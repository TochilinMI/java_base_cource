package ru.tochilinmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Put your num");
        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();

        int res = num < 10 ? (num + 10) : (num - 10);
        System.out.println("Result:"+res);

    }
}
