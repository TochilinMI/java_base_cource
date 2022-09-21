package ru.tochilinmi;

abstract class Car {

    //Valuable
    protected Integer speed; //extends visible
    private String model;
    private Float weight;
    private String color;
    private boolean isWork;

    //Nested class
    public class Driving{
        private boolean isDrive;
        Driving(boolean isDrive){
            this.isDrive = isDrive;
        }
        public void drive(){
            System.out.println(this.isDrive);
        }

    }

    Driving engine = new Driving(true);
    //construct
    public Car(String model, Float weight, String color, boolean isWork) {
//        this.speed = speed;
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.isWork = isWork;
    }

    //Functions or methods
    public void setAll(Integer speed, String model, Float weight, String color, boolean isWork){
        this.speed=speed;
        this.model=model;
        this.weight=weight;
        this.color=color;
        this.isWork=isWork;
    }
    public void printAll(){
        String isWork = this.isWork ? "working":"not working";
        System.out.println("Cars model "+this.model
                         + ", speed limit of " + this.speed
                         + "km/h weight: " + this.weight
                         + ". Its color: " + this.color
                         + " and car is " + isWork
                );
    }

    //abstract method
    abstract void enginStart();
}
