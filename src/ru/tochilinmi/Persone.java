package ru.tochilinmi;

public class Persone implements HumanIntarface{
    private int age;
    private  Personality person;

    public Persone(int age, Personality person) {
        this.age = age;
        this.person = person;
    }

    @Override
    public void talk() {
        System.out.println("Hello! I can talk!");
        System.out.println("Person:"+this.person);
    }

    @Override
    public void walk() {
        System.out.println("Hello! I can walk!");
    }

    @Override
    public int getAge() {
        return age;
    }
}
