package oops;

class Animals {
    void sound() {                          // Virtual Method by default
        System.out.println("Animal Sound");
    }
}

class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cats extends Animals {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class virtualConcept {
    public static void main(String[] args) {

        Animals a1 = new Dogs();             // Upcasting
        Animals a2 = new Cats();

        a1.sound();                        // Calls Dog's sound()
        a2.sound();                        // Calls Cat's sound()
    }
}

/*
VIRTUAL CONCEPT

C++:
virtual void sound();

Java:
→ virtual keyword nahi hota.

Lekin Java me non-static, non-final,
non-private methods automatically virtual hote hain.


Virtual Method:
Animal a = new Dog();
a.sound();

Reference Type : Animal
Object Type    : Dog

Output:
Dog Barks

Runtime me decide hota hai kaunsa method chalega.


Dynamic Method Dispatch:
Parent reference child object ko hold karta hai.
Example:
Animal a = new Dog();
Runtime par Dog ka overridden method call hota hai.

*/