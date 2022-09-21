package ru.tochilinmi;

public class BMW extends Car{
//    final as valuable is constant
//    final as Class can't have any child class
    private boolean isMPerfomance = false;

    public static int num = 20;

    public BMW(boolean isMPerfomance, String model, Float weight, String color, boolean isWork,Integer speed) {
        super(model, weight, color, isWork);
        this.isMPerfomance = isMPerfomance;
        this.speed = speed;
    }
    public void printAll(){
        super.printAll();
        String isMPerfomance = this.isMPerfomance ? "is":"isn't";
        System.out.println("Car "+isMPerfomance+" M Perfomance");
    }

    @Override
    void enginStart() {
        System.out.println("Car starting by a button");
    }
}
