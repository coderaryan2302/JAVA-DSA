package oops.pillarOfOOPS.polymorphism;

// Parent Class
class Animal {
    void speak() {
        System.out.println("Animal Speaks");
    }
}

// Child Class
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat Meows");
    }
}

public class methodOverriding{
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.speak();
        a2.speak();
    }
}

/*
Run-Time Polymorphism

Method Overriding:
- Parent class method
- Child class me same method redefine

Runtime par decide hota hai
kaunsa method execute hoga.


Important Points:
1. Parent-Child relationship hona chahiye.
2. Method signature same hona chahiye.
3. @Override readability improve karta hai.
4. Parent reference child object ko hold kar sakta hai.

*/
