package oops;
public class constructors {

    static class Car {
        int seats;          // Number of seats
        String name;        // Car name
        double length;      // Length in meters

        // Default Constructor
        Car() {

            seats = 7;
            name = "Unknown";
            length = 0.0;
        }

        // Parameterized Constructor
        Car(int seats, String name, double length) {

            this.seats = seats;         // Current object's seats
            this.name = name;           // Current object's name
            this.length = length;       // Current object's length
        }

        // Copy Constructor (User Defined)
        Car(Car c) {

            this.seats = c.seats;       // Copy seats
            this.name = c.name;         // Copy name
            this.length = c.length;     // Copy length
        }

        void print() {

            System.out.println("Seats : " + seats + ", Name : " + name + ", Length : " + length);
        }
    }

    public static void main(String[] args) {

        // Parameterized Constructor
        Car c1 = new Car(5, "Kia Sonet", 3.99);
        c1.print();

        // Parameterized Constructor
        Car c2 = new Car(6, "Tata Nexon", 4.05);
        c2.print();

        // Default Constructor
        Car c3 = new Car();

        c3.name = "Tata Safari";        // Updating one field

        c3.print();

        // Copy Constructor
        Car c4 = new Car(c1);

        c4.name = "Kia Carens";         // Changing copied object

        c4.print();

        // Original object remains unchanged
        c1.print();
    }
}

/*
Constructor:
→ Special method jo object create hote hi automatically call hota hai.

Types of Constructors:
1. Default Constructor
   Car()

   → Koi argument nahi leta.
   → Default/initial values set karta hai.

2. Parameterized Constructor
   Car(int seats, String name, double length)

   → Values receive karta hai.
   → Object ko creation time par initialize karta hai.

3. Copy Constructor (User Defined)
   Car(Car c)

   → Ek object ki values dusre object me copy karta hai.

   Example:
   Car c4 = new Car(c1);

Important Points:
1. Constructor ka naam class ke naam jaisa hota hai.
2. Constructor ka koi return type nahi hota.
3. Constructor object bante hi automatically call hota hai.
4. new keyword constructor ko invoke karta hai.
5. this keyword current object ko refer karta hai.
6. Ek class me multiple constructors ho sakte hain.
   Isse Constructor Overloading kehte hain.
7. Java me built-in Copy Constructor nahi hota.
   Programmer khud bana sakta hai.

Interview Points:
✓ Constructor has no return type.
✓ Constructor cannot be called directly.
✓ Java provides default constructor only if no constructor is defined.
✓ Copy Constructor is user-defined in Java.

Easy Revision:
Car()               → Default Constructor
Car(int,...)        → Parameterized Constructor
Car(Car c)          → Copy Constructor
this                → Current Object
new                 → Object Creation

Golden Line:
"Constructors initialize objects, and Java allows
constructor overloading to provide multiple ways
to create and initialize objects."

*/