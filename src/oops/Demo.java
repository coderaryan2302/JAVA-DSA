package oops;
class Student {
    int rollNo = 48;                  // Instance variable
    String studentName = "Aryan";     // Instance variable

    void printDetails() {
        System.out.println("Roll No      : " + rollNo);          // Print roll number
        System.out.println("Student Name : " + studentName);     // Print name
    }
}

public class Demo {
    public static void main(String[] args) {
        Student obj1 = new Student();      // First object creation

        System.out.println("Student 1 Details:");
        obj1.printDetails();

        System.out.println();

        Student obj2 = new Student();      // Second object creation
        obj2.rollNo = 60;                  // Changing roll number
        obj2.studentName = "Atharv";       // Changing name

        System.out.println("Student 2 Details:");
        obj2.printDetails();
    }
}

/*
Important Points:
1. Class ek blueprint/template hoti hai.
   Iske basis par objects bante hain.
2. Object class ka real-world instance hota hai.
   Jaise Student class se obj1 aur obj2 objects bane.
3. Har object ki apni alag copy hoti hai instance variables ki.
   Isliye obj2 ki value change karne se obj1 par koi effect nahi padta.
4. new keyword memory allocate karta hai aur object create karta hai.
5. Ek main() method me jitne chahe utne objects bana sakte hain.
6. Ek Java file me multiple classes ho sakti hain,
   lekin public class sirf ek hoti hai.
7. Public class ka naam aur Java file ka naam same hona chahiye.

Interview Points:
- Class = Blueprint
- Object = Instance of Class
- new keyword object create karta hai.
- Instance variables har object ke liye alag hote hain.
*/