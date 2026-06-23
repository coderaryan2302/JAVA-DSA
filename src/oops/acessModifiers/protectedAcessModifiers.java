package oops.acessModifiers;
class Person {
    protected int money = 50000;
}

class Child extends Person {
    void show() {
        System.out.println(money);    // Accessible in child class
    }
}

public class protectedAcessModifiers {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

/*
Important Points:
1. protected members:
   - Same package me accessible hote hain.
   - Child classes me bhi accessible hote hain.

Example:
Parents ki Property → Family members access kar sakte hain.
*/