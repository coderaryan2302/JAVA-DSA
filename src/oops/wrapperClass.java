package oops;
public class wrapperClass {

    public static void main(String[] args) {

        // Autoboxing
        Integer num = 10;              // int → Integer

        // Unboxing
        int x = num;                   // Integer → int

        System.out.println("Integer Object : " + num);

        System.out.println("Primitive int : " + x);

        // String to Integer
        String s = "100";

        int value = Integer.parseInt(s);

        System.out.println("Converted Value : " + value);
        System.out.println("Maximum Integer : " + Integer.MAX_VALUE);
    }
}

/*
WRAPPER CLASS

Wrapper Class:
→ Primitive ko Object me convert karti hai.

Primitive → Wrapper

int       → Integer
double    → Double
char      → Character
boolean   → Boolean
long      → Long


Autoboxing:
int → Integer
Integer num = 10;


Unboxing:
Integer → int
int x = num;


Important Points:
1. Collection Framework objects store karta hai.
2. Wrapper Classes immutable hoti hain.
3. parseInt() String ko int me convert karta hai.

Interview Points:
✓ Autoboxing
✓ Unboxing
✓ parseInt()

Easy Revision:
Primitive → Wrapper
Wrapper → Primitive
parseInt → String to int

Golden Line:
"Wrapper classes allow primitives to behave like objects."


*/