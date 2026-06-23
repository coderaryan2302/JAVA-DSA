package oops;
class Cricketer {

    // Static Variable (Class Variable)
    static String country = "Not Assigned";

    // Instance Variables
    int runs;
    String name;
    double avg;

    // Instance Method
    void print() {
        System.out.println("Name    : " + name + ", Runs : " + runs + ", Avg : " + avg + ", Country : " + country);
    }

    // Static Method
    static void greet() {
        System.out.println("Welcome to Team India");
    }
}

public class staticKeyword {
    public static void main(String[] args) {

        // Static Method Call
        Cricketer.greet();                     // Class name se call

        Cricketer c1 = new Cricketer();
        c1.name = "Virat Kohli";
        c1.runs = 13848;
        c1.avg = 58.18;

        Cricketer c2 = new Cricketer();
        c2.name = "Rohit Sharma";
        c2.runs = 11168;
        c2.avg = 48.76;

        // Static Variable Update
        Cricketer.country = "India";
        System.out.println("\nCricketer 1:");
        c1.print();

        System.out.println("\nCricketer 2:");
        c2.print();

        System.out.println("\nAccessing Static Variable:");
        System.out.println(Cricketer.country);
    }
}

/*
STATIC KEYWORD

1. static Variable (Class Variable)
   → Class se belong karti hai.
   → Sabhi objects ke liye common hoti hai.

   Example:
   static String country;

2. Instance Variable
   → Har object ki alag copy hoti hai.

   Example:
   runs, name, avg

3. static Method
   → Class se belong karta hai.
   → Object banaye bina call kar sakte hain.

   Syntax:
   ClassName.methodName();

   Example:
   Cricketer.greet();

4. Static Variable Update
   Cricketer.country = "India";
   Sab objects me country ki value change ho jayegi.

Important Points:
1. static members memory me sirf ek baar bante hain.
2. static members ko Class Name se access karna best practice hai.
3. static method directly non-static variables access nahi kar sakta.
4. Non-static methods static variables ko access kar sakte hain.

Interview Points:
✓ static Variable → Class Variable
✓ Non-static Variable → Instance Variable
✓ static Method → Object ke bina call ho sakta hai
✓ Shared data ke liye static use hota hai

Easy Revision:
static Variable → Shared by All Objects
Instance Variable → Separate for Each Object
static Method → ClassName.method()
new → Object Creation

*/