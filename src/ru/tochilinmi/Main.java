package ru.tochilinmi;

public class Main {

    public static void main(String[] args) {
        byte[] nums_array = new byte[5]; // create an array, allocated memory for 5th objects of array
        byte nums_array2[] = new byte[6]; // another interpretation of initiate...
        nums_array[0]=1;
        nums_array2[0]=1;

        String[] words = new String[]{"word1","word2","word3","word4"}; // Make array and fill it with auto-create memory
        words[0] = "word5";
        System.out.println(words[0]);
    }
}
