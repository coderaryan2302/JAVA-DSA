package oops;
class Fraction {

    int numerator;      // Upper part of fraction
    int denominator;    // Lower part of fraction

    // Constructor
    Fraction(int num, int den) {
        if (den == 0) {                                    // Invalid denominator check
            System.out.println("Denominator cannot be 0. Setting denominator to 1.");
            den = 1;
        }
        this.numerator = num;                             // Initialize numerator
        this.denominator = den;                           // Initialize denominator

        simplify();                                       // Store fraction in simplest form
    }

    // Print fraction
    void print() {
        System.out.println(numerator + "/" + denominator);   // Display fraction
    }

    // Addition
    void add(Fraction f) {
        numerator = numerator * f.denominator + denominator * f.numerator;           // Cross multiplication
        denominator = denominator * f.denominator;        // Common denominator
        simplify();                                       // Reduce fraction
    }

    // Multiplication
    void multiply(Fraction f) {
        numerator = numerator * f.numerator;              // Multiply numerators
        denominator = denominator * f.denominator;        // Multiply denominators
        simplify();                                       // Reduce fraction
    }

    // Division
    void divide(Fraction f) {
        if (f.numerator == 0) {                           // Division by zero check
            System.out.println("Cannot divide by zero fraction.");
            return;
        }
        numerator = numerator * f.denominator;            // Multiply by reciprocal
        denominator = denominator * f.numerator;
        simplify();                                       // Reduce fraction
    }

    // Simplify fraction
    void simplify() {
        int gcdValue = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcdValue;                            // Simplify numerator
        denominator /= gcdValue;                          // Simplify denominator
        if (denominator < 0) {                            // Keep denominator positive
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Find GCD using Euclid Algorithm
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;                                 // Store b
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class fractionExample {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(3, 7);          // 3/7
        Fraction f2 = new Fraction(7, 3);          // 7/3

        System.out.println("Initial Fractions:");
        System.out.print("f1 = ");
        f1.print();

        System.out.print("f2 = ");
        f2.print();

        System.out.println("\nAfter Addition:");
        f1.add(f2);                                // f1 = f1 + f2
        System.out.print("f1 = ");
        f1.print();

        System.out.println("\nAfter Multiplication:");
        f1.multiply(f2);                           // f1 = f1 × f2
        System.out.print("f1 = ");
        f1.print();

        System.out.println("\nAfter Division:");
        f1.divide(f2);                             // f1 = f1 ÷ f2
        System.out.print("f1 = ");
        f1.print();
    }
}

/*
Important Points:

1. Fraction = numerator / denominator

2. Constructor object banate time values initialize karta hai.

3. denominator kabhi bhi 0 nahi hona chahiye.

4. Addition:
   a/b + c/d = (ad + bc) / bd

5. Multiplication:
   a/b × c/d = (ac) / (bd)

6. Division:
   a/b ÷ c/d = (a × d) / (b × c)

7. Fraction ko simplify karne ke liye GCD use kiya jata hai.

8. Euclid Algorithm GCD nikalne ka efficient tareeka hai.

Interview Points:
- this current object ko refer karta hai.
- Object methods dusre objects ko parameter ke roop me le sakte hain.
- Invalid cases (denominator = 0) ko handle karna good practice hai.
*/