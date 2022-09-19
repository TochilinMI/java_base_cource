package ru.tochilinmi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*int userInput;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            userInput=in.nextInt();
        }while (userInput!=5);
        System.out.println("Well done!");*/

        /*
        int[][] matrix = new int[][]{
                {1,5,9,13,17},
                {2,6,10,15,18},
                {3,7,11,15,19},
                {4,8,12,16,20}
        };

        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(" A("+i+j+")"+matrix[i][j]);
            }
            System.out.println(" ");
        }*/

        /*ArrayList<String> words = new ArrayList<>(0);
        words.add("word1");
        words.add("word2");
        words.add("word3");
        words.add("word4");
        words.add("word5");

        for (String el: words) System.out.println(el);*/

        int i = 0;
        while (i < 10){
            if(i == 5) break;
//            if( i++ % 2 ==0) continue;
            if( i % 2 ==0){
                i++;
                continue;//scip iteration
            }
            System.out.println(i);
            i++;
        }
    }
}
