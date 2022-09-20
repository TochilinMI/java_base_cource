package ru.tochilinmi;

public class Car {

    //Valuable
    private Integer speed;
    private String model;
    private Float weight;
    private String color;
    private boolean isWork;

    //construct
    public Car(Integer speed, String model, Float weight, String color, boolean isWork) {
        this.speed = speed;
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
}
