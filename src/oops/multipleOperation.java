package oops;
class Algebra {
    int a;      // First number
    int b;      // Second number

    // Constructor
    Algebra(int a, int b) {
        this.a = a;                 // Initialize first number
        this.b = b;                 // Initialize second number
        System.out.println("Constructor Called");
    }

    int add() {
        return a + b;               // Return addition
    }

    int subtract() {
        return a - b;               // Return subtraction
    }

    int multiply() {
        return a * b;               // Return multiplication
    }

    void printOperations() {
        System.out.println("Addition       : " + add());
        System.out.println("Subtraction    : " + subtract());
        System.out.println("Multiplication : " + multiply());
    }
}

public class multipleOperation {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra(5, 7);
        System.out.println("\nFor Object 1:");
        obj1.printOperations();

        Algebra obj2 = new Algebra(10, 4);
        System.out.println("\nFor Object 2:");
        obj2.printOperations();
    }
}

/*
Important Points:

1. Constructor object create hote hi automatically call hota hai.

2. this keyword current object ke instance variables ko refer karta hai.

3. Methods object ke behavior ko define karte hain.

4. return statement method ka result wapas bhejta hai.

5. Ek hi class ke multiple objects ban sakte hain,
   aur har object apni alag values store karta hai.

6. Code repetition avoid karne ke liye common logic ko
   alag method (printOperations) me rakhna good practice hai.

Interview Points:

- Constructor ka return type nahi hota.
- Object ke instance variables har object ke liye alag hote hain.
- Methods reusability aur readability improve karte hain.
*/