package oops;

// Abstract Class
abstract class Animal {
    String name;                    // Instance variable

    // Constructor
    Animal(String name) {
        this.name = name;           // Initialize name
        System.out.println("Animal Constructor Called");
    }

    // Abstract Method
    abstract void sound();          // No implementation

    // Normal Method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child Class
class Dog extends Animal {
    Dog(String name) {
        super(name);                // Parent constructor call
    }

    @Override
    void sound() {
        System.out.println(name + " says: Bark");
    }
}

// Child Class
class Cat extends Animal {
    Cat(String name) {
        super(name);                // Parent constructor call
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow");
    }
}

public class abstractClass {
    public static void main(String[] args) {

        // Animal a = new Animal();
        // Error: Abstract class ka object nahi ban sakta.

        Animal dog = new Dog("Tommy");      // Upcasting
        dog.sound();
        dog.eat();

        System.out.println();

        Animal cat = new Cat("Kitty");

        cat.sound();
        cat.eat();
    }
}

/*
ABSTRACT CLASS

Abstract Class:
→ Aisi class jiska object nahi ban sakta.
→ abstract keyword se banti hai.

Syntax:
abstract class ClassName {

}

Abstract Method:
abstract void sound();
→ Iski body nahi hoti.
→ Sirf declaration hoti hai.
→ Child class ko implementation deni padti hai.



Normal Methods:
void eat() {

}
→ Abstract class me normal methods bhi ho sakte hain.

Constructor:
Animal(String name)
→ Abstract class me constructor ho sakta hai.
→ Child object create hone par parent constructor call hota hai.

Important Points:

1. Abstract class ka object nahi ban sakta.

2. Abstract class me:
   ✓ Variables ho sakte hain.
   ✓ Constructors ho sakte hain.
   ✓ Normal methods ho sakte hain.
   ✓ Abstract methods ho sakte hain.

3. Child class ko abstract methods override karne padte hain.

4. Agar child class abstract methods implement nahi kare,
   to child class ko bhi abstract banana padega.

5. Abstract class partial abstraction provide karti hai.

Interview Points:

✓ abstract keyword use hota hai.
✓ Object create nahi kar sakte.
✓ Constructor allowed hota hai.
✓ Abstract + Normal methods dono ho sakte hain.
✓ Method Overriding compulsory hoti hai.

Easy Revision:

abstract class → Incomplete Class
abstract method → No Body
@Override → Implementation
super() → Parent Constructor
Object → Not Allowed

Golden Line:
Abstract class is used to achieve abstraction by hiding implementation details and forcing child classes to provide specific implementations.

*/