package HworkClass21;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
public class Computer {
    String make;
    String model;
    String color;
    double memory;

    public Computer(String make, String model, String color, double memory) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.memory = memory;
    }

    void exterior() {
        System.out.println("The make is " + make + " and color is " + color + " and model is " + model);
    }

    void perfomance() {
        System.out.println("Has memory of " + memory + " GB");
    }
}

    class Apple extends Computer{

        public Apple(String make, String model, String color, double memory) {
            super(make, model, color, memory);
        }

        @Override
        void perfomance() {
            System.out.println("This computer has bigger memory than Lenovo, which is "+memory+" GB");
        }
    }
    class Lenovo extends Computer{

        public Lenovo(String make, String model, String color, double memory) {
            super(make, model, color, memory);
        }
    }
    class HP extends Computer{

        public HP(String make, String model, String color, double memory) {
            super(make, model, color, memory);
        }

        @Override
        void perfomance() {
            System.out.println("This machine is recommended for students, it performs faster with "+memory+" GB");
        }
    }
    class Dell extends Computer{

        public Dell(String make, String model, String color, double memory) {
            super(make, model, color, memory);
        }
        void origin(){
            System.out.println("The origin is German");
        }
    }

