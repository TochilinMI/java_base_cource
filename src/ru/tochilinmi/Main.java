package ru.tochilinmi;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("word1");
        words.add("word2");
        words.add("word3");
        words.add("word4");

        System.out.println(words.get(0));
    }
}
