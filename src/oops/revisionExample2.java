package oops;
class Pokemon {

    private int power;      // Direct access not allowed
    String type;            // Default access

    // Parameterized Constructor
    Pokemon(String type, int power) {
        this.type = type;         // Initialize type
        this.power = power;       // Initialize power
    }

    // Default Constructor
    Pokemon() {
        // Default values:
        // power = 0
        // type = null
    }

    // Getter
    int getPower() {
        return power;             // Return private variable
    }

    // Setter
    void setPower(int power) {
        this.power = power;       // Update power
    }

    // Display Method
    void print() {
        System.out.println("Type  : " + type);
        System.out.println("Power : " + power);
    }
}

public class revisionExample2 {
    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("electric", 70);

        pikachu.type = "fire";           // Allowed (default access)
        // pikachu.power = 34;           // Error: power is private

        Pokemon jigglypuff = new Pokemon("fairy", 50);

        System.out.println("Pikachu Power : " + pikachu.getPower());

        System.out.println("\nPikachu:");
        pikachu.print();

        System.out.println("\nJigglypuff:");
        jigglypuff.print();

        Pokemon gengar = new Pokemon();   // Default constructor

        System.out.println("\nGengar:");
        gengar.print();

        final int x = 89;                 // Constant value

        // x = 76;                        // Error: final variable cannot be reassigned

        System.out.println("\nFinal Value of x : " + x);
    }
}

/*
================ Important Points ================

1. private variable ko direct access nahi kar sakte.

2. Getter value ko read karne ke liye use hota hai.
      Example:
      getPower()

3. Setter value update karne ke liye use hota hai.
      Example:
      setPower()

4. Constructor object create hote hi automatically call hota hai.

5. Default Constructor:
   - Koi parameter nahi leta.
   - Default values assign hoti hain.
     int    → 0
     String → null

6. this keyword current object ko refer karta hai.

7. final variable ko ek baar value assign hone ke baad
   dobara change nahi kar sakte.

Interview Points:
- private → Encapsulation provide karta hai.
- Getter + Setter → Controlled access dete hain.
- Constructor ka return type nahi hota.
- final variable constant ki tarah behave karta hai.

Easy Revision:
private → Data Hiding
Getter  → Read Value
Setter  → Update Value
this    → Current Object
final   → Cannot Change

*/