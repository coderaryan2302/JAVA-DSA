package oops;

// Parent Class
class Animal5 {

    // Final Method
    final void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child Class
class Dog5 extends Animal5 {

//    @Override
//    void eat() {
//        System.out.println("Dog is eating.");
//    }

    /*
    Error:
    Final method ko override nahi kar sakte.
    */
}

// Final Class
final class Calculator {
    void add() {
        System.out.println("Addition Method");
    }
}

// class AdvanceCalculator extends Calculator {
//
// }
//
// Error:
// Final class ko inherit (extend) nahi kar sakte.

public class finalKeyword {

    public static void main(String[] args) {

        //Final Variable
        final int x = 100;                    // Constant value
        System.out.println("Final Variable : " + x);

        // x = 200;
        // Error: final variable ki value change nahi kar sakte.


        //Final Method
        Dog5 dog = new Dog5();
        dog.eat();


        //Final Class
        Calculator cal = new Calculator();
        cal.add();
    }
}

/*
 FINAL KEYWORD

final keyword ko 3 jagah use kar sakte hain:

1. Final Variable
final int x = 100;

→ Value ek baar assign hone ke baad
  change nahi kar sakte.
Example:
PI value
Roll Number
Constant Values


2. Final Method
final void eat() {

}

→ Child class is method ko override
  nahi kar sakti.

Use:
Important logic ko protect karne ke liye.


3. Final Class
final class Calculator {

}

→ Is class ko koi inherit nahi kar sakta.

Use:
Security aur immutability ke liye.


Important Points:
1. final variable = Constant.
2. final method = Override nahi hota.
3. final class = Extend nahi hoti.
4. final keyword restrictions provide karta hai.

Interview Points:
✓ final Variable:
  Value cannot be changed.
✓ final Method:
  Cannot be overridden.
✓ final Class:
  Cannot be inherited.

Easy Revision:
final Variable → Cannot Change
final Method   → Cannot Override
final Class    → Cannot Extend

Golden Line:
"final keyword is used to restrict modification."

*/