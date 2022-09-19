package ru.tochilinmi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        byte[] nums_array = new byte[5]; // create an array, allocated memory for 5th objects of array
        nums_array[0]=1;
        nums_array[1]=10;
        nums_array[2]=5;
        nums_array[3]=105;
        nums_array[4]=5;

        byte[] new_array = Arrays.copyOf(nums_array,nums_array.length); //Copy paste array


        String[] words = new String[]{"word1","word2","word3","word4"}; // Make array and fill it with auto-create memory
        words[0] = "word5";

        System.out.println(Arrays.toString(new_array));
        Arrays.sort(new_array); //sorting an array
        System.out.println(Arrays.toString(new_array));
    }
}
