package ru.tochilinmi;

public class Main {

    public static void main(String[] args) {
        float[] arr = new float[]{ 1.2f,23.1f,7.001f};

        try {
            System.out.println(arr[3]);
            int i = 100/0;
        } catch (Exception e){
            System.err.println("--------------------------------------------------\nError: "+
                                e+"\n--------------------------------------------------");
        } finally {
            System.out.println("Complete try and catch");
        }

    }
}
