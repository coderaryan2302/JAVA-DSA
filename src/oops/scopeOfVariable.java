package oops;
class Operation {

    int x = 100;          // Class Level Scope (Instance Variable)

    void demo() {
        int a = 10;       // Method Level Scope (Local Variable)

        System.out.println("Class Variable x : " + x);
        System.out.println("Method Variable a : " + a);

        // First Block
        {
            int b = 30;   // Block Level Scope

            System.out.println("Block 1 Variable b : " + b);

            // a and x can also be accessed here
            System.out.println("Accessing a inside block : " + a);
            System.out.println("Accessing x inside block : " + x);
        }

        // System.out.println(b);
        // Error: b sirf upar wale block ke andar accessible tha.


        // Second Block
        {
            int b = 10;   // Allowed, kyunki ye alag block hai
            System.out.println("Block 2 Variable b : " + b);
        }
    }
}

public class scopeOfVariable {
    public static void main(String[] args) {
        Operation obj = new Operation();
        obj.demo();
    }
}

/*
Scope of Variables

1. Class Level Scope (Instance Variable)

   Example:
       int x = 100;

   • Class ke andar declare hota hai.
   • Class ke sabhi methods access kar sakte hain.
   • Object ke through use hota hai.

2. Method Level Scope (Local Variable)

   Example:
       int a = 10;

   • Sirf us method ke andar accessible hota hai.
   • Method ke bahar use nahi kar sakte.

3. Block Level Scope

   Example:
       {
           int b = 30;
       }

   • Sirf us block { } ke andar accessible hota hai.
   • Block ke bahar use karne par error aata hai.
   • Alag blocks me same variable name use kar sakte hain.

Important Points:
1. Inner block outer variables ko access kar sakta hai.
2. Outer block inner block ke variables ko access nahi kar sakta.
3. Variable ka scope jitna chhota ho,
   code utna readable aur safe hota hai.

Interview Points:
✓ Class Variable  → Instance Variable
✓ Method Variable → Local Variable
✓ Block Variable  → Block Scope
✓ Local variables ko use karne se pehle initialize karna padta hai.

Easy Revision:
Class Scope   → Puri Class
Method Scope  → Sirf Method
Block Scope   → Sirf { } Block

*/