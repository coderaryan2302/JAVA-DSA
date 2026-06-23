package oops;
public class thisKeyword {

    static class Car {
        int price;         // Instance Variable
        String name;       // Instance Variable

        // Default Constructor
        Car() {
            System.out.println("Default Constructor Called");
        }

        // Parameterized Constructor
        Car(int price, String name) {
            this.price = price;      // Current object's price
            this.name = name;        // Current object's name
        }

        // Constructor with different parameter order
        Car(String name, int price) {
            this.price = price;      // Current object's price
            this.name = name;        // Current object's name
        }

        void print() {
            int price = 12;          // Local Variable

            System.out.println("Local Price      : " + price);
            System.out.println("Object Price     : " + this.price);
            System.out.println("Car Name         : " + this.name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(120000, "Kia Seltos");
        System.out.println("Car 1:");
        c1.print();

        Car c2 = new Car("Lord Alto", 110000);
        System.out.println("\nCar 2:");
        c2.print();

        Car c3 = new Car();

        c3.name = "Tata Safari";
        c3.price = 180000;

        System.out.println("\nCar 3:");
        c3.print();
    }
}

/*
THIS KEYWORD
this → Current Object ko refer karta hai.

Uses of this Keyword:
1. Instance Variable aur Local Variable me difference batane ke liye.

   Example:

   Car(int price) {
       this.price = price;
   }

2. Current Object ke members ko access karne ke liye.

   Example:

   this.name

3. Constructor Chaining ke liye.
   (this(...))
   Ye same class ke dusre constructor ko call karta hai.


Important Points:
1. this sirf non-static context me use hota hai.

2. this.price
   → Object ka instance variable.

3. price
   → Nearest/local variable ko refer karta hai.

4. Local variable ki priority instance variable se zyada hoti hai.

Interview Points:
✓ this = Current Object Reference
✓ Constructor me naming conflict solve karta hai.
✓ this(...) constructor chaining ke liye use hota hai.
✓ static methods me this use nahi kar sakte.

Easy Revision:
price       → Local Variable
this.price  → Instance Variable
this.name   → Current Object Name
this(...)   → Another Constructor Call

*/