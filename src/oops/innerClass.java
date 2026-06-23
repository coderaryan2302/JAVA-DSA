package oops;
public class innerClass {
    String college = "IES";          // Outer class variable

    // Inner Class
    class Student {
        String name;
        Student(String name) {
            this.name = name;         // Initialize name
        }

        void print() {
            System.out.println("Name : " + name);
            System.out.println("College : " + college);
        }
    }

    public static void main(String[] args) {
        innerClass outer = new innerClass();
        innerClass.Student s = outer.new Student("Aryan");
        s.print();
    }
}

/*
INNER CLASS

Inner Class:
→ Ek class ke andar dusri class.

Outer Class:
→ Main class.

Inner Class:
→ Outer class ke members access kar sakti hai.

Syntax:
Outer.Inner obj =
outer.new Inner();

Important Points:

1. Inner class outer class ke variables access kar sakti hai.

2. Pehle outer object banana padta hai.

3. Inner class logical grouping ke liye use hoti hai.

Interview Points:

✓ Outer Class
✓ Inner Class
✓ outer.new Inner()

Easy Revision:

Outer Class
↓
Inner Class

Outer Object
↓
outer.new Inner()

Golden Line:
"Inner classes help logically group related classes together."

*/