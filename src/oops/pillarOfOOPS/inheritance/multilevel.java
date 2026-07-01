package oops.pillarOfOOPS.inheritance;

// Parent Class
class Vehicle1 {
    void start() {
        System.out.println("Vehicle Started");                  // Parent method
    }
}

// Child Class
class Car1 extends Vehicle1 {
    void drive() {
        System.out.println("Car is Driving");        // Child method
    }
}

// Grandchild Class
class SportsCar extends Car1 {
    void race() {
        System.out.println("Sports Car is Racing");   // Grandchild method
    }
}

public class multilevel {
    public static void main(String[] args) {

        SportsCar car = new SportsCar();

        car.start();      // From Vehicle
        car.drive();      // From Car
        car.race();       // From SportsCar
    }
}

/*
Multilevel Inheritance:
Parent → Child → Grandchild

Important Points:

1. Multilevel Inheritance me ek class dusri class ko inherit karti hai,
   aur teesri class us child class ko inherit karti hai.

2. SportsCar indirectly Vehicle ki properties aur methods
   bhi access kar sakti hai.

3. extends keyword inheritance ke liye use hota hai.

4. Child class Parent ki members ko reuse kar sakti hai.

Interview Points:
- Java supports Multilevel Inheritance.
- "is-a" Relationship:
      SportsCar is a Car.
      Car is a Vehicle.
      SportsCar is also a Vehicle.
- Code Reusability badh jati hai.
*/