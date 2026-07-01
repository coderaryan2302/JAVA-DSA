package oops.pillarOfOOPS;

// Abstract Class
abstract class Vehicle {
    abstract void start();      // Abstract Method
    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

// Child Class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car Starts Using Key");
    }
}

// Child Class
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike Starts Using Self Start");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        System.out.println();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}

/*
ABSTRACTION

Abstraction:
→ Important features dikhana.
→ Implementation details hide karna.

Abstract Class:
→ abstract keyword se banti hai.
→ Iske objects nahi bante.

Abstract Method:
→ Body nahi hoti.
→ Child class implementation deti hai.

Important Points:

1. Abstract class me abstract aur normal methods dono ho sakte hain.
2. Child class ko abstract methods override karne padte hain.
3. Abstract class ka object nahi banta.

Interview Line:
"Abstraction focuses on what an object does
rather than how it does it."

*/