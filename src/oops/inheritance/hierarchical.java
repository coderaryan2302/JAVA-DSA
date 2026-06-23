package oops.inheritance;

class Vehicle3 {
    void show() {
        System.out.println("This is a Vehicle");
    }
}

class Car3 extends Vehicle3 {
    void drive() {
        System.out.println("Car is Driving");
    }
}

class Bicycle extends Vehicle3 {
    void pedal() {
        System.out.println("Bicycle is Pedaling");
    }
}

public class hierarchical {
    public static void main(String[] args) {

        Car3 car = new Car3();
        car.show();
        car.drive();

        System.out.println();

        Bicycle bicycle = new Bicycle();
        bicycle.show();
        bicycle.pedal();
    }
}

/*
Hierarchical Inheritance:

        Vehicle
        /     \
      Car   Bicycle

One Parent → Multiple Children
*/
