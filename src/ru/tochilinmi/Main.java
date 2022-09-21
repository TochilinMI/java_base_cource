package ru.tochilinmi;

public class Main {
    public static void main(String[] args){
//        Car bmv = new Car("302i", 1.330f, "white", true);
//        bmv.setAll();
//        bmv.printAll();

        BMW m5 = new BMW(true,"M5", 2300.42f, "black", true,300);
        m5.printAll();
        m5.enginStart();

        //Anonymous class
        Audi obj = new Audi(){
            private boolean isWork;

            public void isDrive(){
                this.isWork = true;
            }

            public void printAll(){
                System.out.println(isWork);
            }
        };

        obj.printAll();
        obj.isDrive();
        obj.printAll();

    }

    private static class Audi {
        public void printAll(){}
        public void isDrive(){}
    }
}
