package oops;

// Interface
interface Animal4 {
    void sound();          // By default public abstract
}

// Dog Class
class Dog4 implements Animal4 {
    @Override
    public void sound() {

        System.out.println("Dog Barks");
    }
}

// Cat Class
class Cat4 implements Animal4 {
    @Override
    public void sound() {

        System.out.println("Cat Meows");
    }
}

public class interfaceConcept {
    public static void main(String[] args) {

        Dog4 dog = new Dog4();
        Cat4 cat = new Cat4();

        dog.sound();          // Dog implementation
        cat.sound();          // Cat implementation
    }
}

/*
Interface:
→ Interface ek contract ki tarah hota hai.
→ Ye batata hai ki kya kaam karna hai,
   lekin kaise karna hai wo child class decide karti hai.

Example:

Animal
   ↓
sound()

Dog
   ↓
Dog Barks

Cat
   ↓
Cat Meows


Important Points:

1. Interface ka object nahi bana sakte.

   // Animal a = new Animal();  ❌ Error

2. Interface ke methods by default:
   public abstract hote hain.

   void sound();

   Java internally:
   public abstract void sound();

3. implements keyword use hota hai.

   class Dog implements Animal

4. Jo class interface implement karti hai,
   use interface ke saare methods implement karne padte hain.

5. Interface abstraction achieve karne ke liye use hota hai.

Interview Points:

✓ Interface = Contract
✓ implements keyword
✓ Object create nahi hota
✓ Methods by default public abstract

Easy Revision:

interface   → Contract
implements  → Use Interface
@Override   → Method implementation
Abstraction → Implementation Hide

Golden Line:

"Interface tells WHAT to do,
Class tells HOW to do it."

====================================================
*/