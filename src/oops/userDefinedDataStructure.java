package oops;
public class userDefinedDataStructure {

    // User Defined Data Type
    static class Car {

        int seats;          // Number of seats
        String name;        // Car name
        double length;      // Car length

        // Display car details
        void print() {

            System.out.println("Seats : " + seats);      // Print seats
            System.out.println("Name  : " + name);       // Print name
            System.out.println("Length: " + length);     // Print length
        }
    }

    public static void main(String[] args) {

        Car c = new Car();           // Object creation

        c.seats = 5;
        c.name = "Kia Sonet";
        c.length = 170.5;

        c.print();                   // Method calling
    }
}

/*
USER DEFINED DATA STRUCTURE

1. Java me hum apna khud ka data type bana sakte hain
   using class.

2. Car yaha ek User Defined Data Type hai.

3. Car ke andar:
      seats
      name
      length

   ye sab milkar Car object ko represent karte hain.


Object Creation:
Car c = new Car();

Car   → User Defined Data Type
c     → Reference Variable
new   → Memory Allocate karta hai
Car() → Constructor Call


Important Points:
1. Class = User Defined Data Type.
2. Object = Instance of Class.
3. Ek object multiple related data ko ek jagah store karta hai.
4. Methods object ka behaviour define karte hain.

Interview Points:
✓ Primitive Data Types:
   int, double, char, boolean

✓ User Defined Data Types:
   Class, Interface, Enum

✓ Class related data ko logically group karti hai.

Easy Revision:
Class  → User Defined Data Type
Object → Real Entity
new    → Memory Allocation
Method → Behaviour

*/