package oops;
import java.util.Scanner;

class Sum {

    // User-defined Default Constructor
//    Sum() {
//        System.out.println("Constructor of Sum is called");
//    }

    /*
    Agar hum koi constructor nahi banate,
    to Java automatically Default Constructor provide karti hai.
    */

    int add(int a, int b) {
        return a + b;                  // Return sum
    }
}

public class sumOfTwoNo {
    public static void main(String[] args) {

        Sum obj = new Sum();           // Object creation

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.print("Enter y : ");
        int y = sc.nextInt();

        int ans = obj.add(x, y);       // Method calling
        System.out.println("Sum of input numbers is : " + ans);
    }
}

/*
CONCEPTS USED

1. Object Creation
   Sum obj = new Sum();

   → new keyword object banata hai.
   → Memory allocate hoti hai.
   → Constructor automatically call hota hai.

2. Constructor
   • Constructor object create hote hi automatically call hota hai.
   • Constructor ka naam class ke naam jaisa hota hai.
   • Constructor ka koi return type nahi hota.

   Example:
   Sum() { }

3. Default Constructor
   • Agar programmer koi constructor nahi banata,
     to Java automatically Default Constructor provide karti hai.

   • Agar programmer khud constructor bana de,
     to Java automatic constructor nahi banati.

4. Method
   int add(int a, int b)

   → Parameters receive karta hai.
   → return statement result wapas bhejta hai.

5. Scanner
   Scanner sc = new Scanner(System.in);
   → User se input lene ke liye use hota hai.

   Common Methods:
   nextInt()     → int input
   nextDouble()  → double input
   next()        → single word
   nextLine()    → complete line


Important Points:
1. Java me object creation ke time constructor call hota hai.
2. Method code reusability provide karta hai.
3. Scanner ko use ke baad close karna good practice hai.
4. return method ka result caller ko bhejta hai.

Interview Points:
✓ Constructor ka return type nahi hota.
✓ Java automatically Default Constructor deti hai.
✓ Scanner user input ke liye use hota hai.
✓ new keyword memory allocate karta hai.

Easy Revision:
new         → Object Creation
Constructor → Auto Call
Method      → Behaviour
return      → Result Wapas
Scanner     → User Input

*/