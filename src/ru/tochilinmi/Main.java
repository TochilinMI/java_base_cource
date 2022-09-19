package ru.tochilinmi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dynamic_arr = new ArrayList<>(0);
        dynamic_arr.add(1);
        dynamic_arr.add(2);
        dynamic_arr.add(213);
        dynamic_arr.add(21);
        dynamic_arr.set(0,21); //set(index, value)
//        dynamic_arr.clear(); // cleaning array
        dynamic_arr.remove(1); //remove element by index
        System.out.println(dynamic_arr.get(2));
    }
}
