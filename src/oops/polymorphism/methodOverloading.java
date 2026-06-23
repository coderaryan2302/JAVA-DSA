package oops.polymorphism;
class Calculator {

    int add(int a, int b) {
        return a + b;                      // 2 integers
    }

    int add(int a, int b, int c) {
        return a + b + c;                  // 3 integers
    }

    double add(double a, double b) {
        return a + b;                      // 2 doubles
    }
}

public class methodOverloading{
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10, 20, 30));
        System.out.println(cal.add(10.5, 20.5));
    }
}

/*
Compile-Time Polymorphism

Method Overloading:
- Same method name
- Different parameters

Compiler compile time par decide karta hai
kaunsa method call hoga.


Important Points:
1. Same class me hota hai.
2. Method name same hota hai.
3. Parameters different hote hain.
4. Return type sirf change karne se overloading nahi hoti.

*/