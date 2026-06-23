package oops;
public class basic {
    int age = 20;                                          // Instance variable
    void display() {
        System.out.println("Age : " + age);   // Display age
    }
    public static void main(String[] args) {
        basic rohan = new basic();                         // Object creation
        rohan.display();                                   // Method calling
    }
}


/*
OOPS BASICS

1. Class
   → Class ek Blueprint/Template hoti hai.
   → Iske basis par Objects bante hain.

   Example:
   Class   = Car
   Objects = BMW, Toyota, Alto

2. Object
   → Object class ka instance hota hai.
   → Real-world entity ko represent karta hai.


3. Object ki 3 Characteristics

   Identity  → Unique Name
               Example: BMW, Toyota

   State     → Attributes/Data
               Example: color, modelNo, year

   Behaviour → Methods/Actions
               Example: brake(), accelerate(), start()

4. Attributes vs Methods

   Attributes (Data):
   - age
   - color
   - modelNo

   Methods (Behaviour):
   - walk()
   - brake()
   - accelerate()

5. Access Modifiers

   public
   → Sab jagah access.
   Example: Road

   private
   → Sirf same class ke andar.
   Example: Mobile Password

   protected
   → Same package + Child class.
   Example: Parents ki property

   default
   → Sirf same package.
   Example: TV at home

6. Object Creation

   Syntax:

   ClassName objectName = new ClassName();

   Example:

   Person rohan = new Person();

   new keyword memory allocate karta hai.

7. Members Access

   Syntax:

   objectName.attribute;
   objectName.method();

   Example:

   rohan.age;
   rohan.walk();

Important Points:
1. Class  = Blueprint
2. Object = Instance of Class
3. new keyword memory allocate karta hai.
4. Har object ki apni alag copy hoti hai instance variables ki.
5. Dot (.) operator se members access hote hain.

Interview Points:
• Java me object creation "new" keyword se hota hai.
• Access Modifiers:
      public > protected > default > private
• Methods object ka behaviour define karte hain.
• Variables object ki state define karte hain.

Revision:
Class      → Blueprint
Object     → Real Entity
Identity   → Unique Name
State      → Attributes
Behaviour  → Methods
new        → Memory Allocation
.          → Member Access

Golden Line:
Class is a blueprint and Object is an instance of that class.

*/