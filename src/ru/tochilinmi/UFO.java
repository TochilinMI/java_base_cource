package ru.tochilinmi;

public class UFO implements HumanIntarface{
    private int age;
    private Personality person;

    public UFO(int age, Personality person) {
        this.age = age;
        this.person = person;
    }
    @Override
    public void talk() {
        System.out.println("Hello! I'm alien!");
        System.out.println("Person:"+this.person);
    }

    @Override
    public void walk() {
        System.out.println("Hello! I'm walking alien!");
    }

    @Override
    public int getAge() {
        return age;
    }
}
