package ru.tochilinmi;

public class Main {
    public static void main(String[] args){
        Persone humanBob = new Persone(23, Personality.MALE);
        System.out.println(humanBob.getAge());
        humanBob.talk();

        UFO alien = new UFO(102, Personality.ALIEN);
        System.out.println(alien.getAge());
        alien.talk();
    }
}
