package ru.tochilinmi;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        int i = 0;
        while (++i<20){
            System.out.println("i:"+i);
        }
        int j = 100;
        do {
            System.out.println("J:"+j);
            j/=2;
        } while (j>2);

    }
}
