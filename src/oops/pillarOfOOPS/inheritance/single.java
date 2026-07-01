package oops.pillarOfOOPS.inheritance;

// Parent Class
class Vehicle {
    int wheels = 4;              // Parent property
    void showVehicle() {
        System.out.println("Vehicle Wheels : " + wheels);
    }
}

// Child Class
class Car extends Vehicle {
    int engineCC = 1500;         // Child property
    void showCar() {
        showVehicle();           // Parent method call
        System.out.println("Engine : " + engineCC + " cc");
    }
}

public class single {
    public static void main(String[] args) {
        Car car = new Car();
        car.showCar();
    }
}

/*
Single Inheritance:

Vehicle → Car

One Parent → One Child

extends keyword use hota hai.
*/
