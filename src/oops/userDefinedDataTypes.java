package oops;
import java.util.Scanner;
public class userDefinedDataTypes {

    // User Defined Data Type
    static class Student {
        String name;      // Student name
        int rollNo;       // Roll number
        double cgpa;      // CGPA

        // Display student details
        void print() {
            System.out.println("Name : " + name + ", Roll No : " + rollNo + ", CGPA : " + cgpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student 1
        Student s1 = new Student();           // First object
        s1.name = "Aryan";
        s1.rollNo = 48;
        s1.cgpa = 8.38;

        // Student 2
        Student s2 = new Student();           // Second object
        s2.name = "Atharv";
        s2.rollNo = 60;
        s2.cgpa = 8.58;

        // Student 3 (User Input)
        Student s3 = new Student();           // Third object

        System.out.print("Enter Name : ");
        s3.name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        s3.rollNo = sc.nextInt();

        System.out.print("Enter CGPA : ");
        s3.cgpa = sc.nextDouble();

        // Display Details
        System.out.println("\nStudent Details:");
        s1.print();
        s2.print();
        s3.print();

        // Changing state of s2 object
        s2.cgpa = 8.70;                       // Update Atharv's CGPA
        System.out.println("\nAfter Changing Atharv's CGPA:");
        s2.print();

    }
}

/*
USER DEFINED DATA TYPES
1. Student ek User Defined Data Type hai.

2. Class related data ko ek saath group karti hai.

   Student:
   • name
   • rollNo
   • cgpa

3. Har object ki apni alag copy hoti hai variables ki.

   Example:
   s1 → Aryan
   s2 → Atharv
   s3 → User Input


Object Creation:
Student s1 = new Student();

Student  → User Defined Data Type
s1       → Reference Variable
new      → Memory Allocate karta hai
Student() → Constructor Call


Object State Change:
s2.cgpa = 8.70;

→ Sirf s2 object ki value change hogi.
→ s1 aur s3 par koi effect nahi padega.


Important Points:
1. Class = User Defined Data Type.
2. Object = Instance of Class.
3. Har object independent hota hai.
4. Object ke through variables access hote hain.
5. Scanner runtime input lene ke liye use hota hai.

Interview Points:
✓ Primitive Data Types:
   int, double, char, boolean

✓ User Defined Data Types:
   Class, Interface, Enum

✓ Har object ki apni state hoti hai.

Easy Revision:
Class      → Blueprint
Object     → Instance
State      → Data of Object
new        → Memory Allocation
Scanner    → User Input
print()    → Behaviour

*/