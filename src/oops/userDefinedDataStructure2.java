package oops;
import java.util.Scanner;
public class userDefinedDataStructure2 {

    // User Defined Data Type
    static class Student {

        String name;       // Student name
        int rollNo;        // Roll number
        double cgpa;       // CGPA

        // Display student details
        void print() {
            System.out.println("Name : " + name + ", Roll No : " + rollNo + ", CGPA : " + cgpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Object
        Student s1 = new Student();
        s1.name = "Aryan";
        s1.rollNo = 48;
        s1.cgpa = 8.38;

        // Second Object
        Student s2 = new Student();
        s2.name = "Atharv";
        s2.rollNo = 60;
        s2.cgpa = 8.58;

        // Third Object (User Input)
        Student s3 = new Student();

        System.out.print("Enter Student Name : ");
        s3.name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        s3.rollNo = sc.nextInt();

        System.out.print("Enter CGPA : ");
        s3.cgpa = sc.nextDouble();

        System.out.println("\nStudent Details:");
        s1.print();
        s2.print();
        s3.print();

    }
}

/*
USER DEFINED DATA STRUCTURE
1. Student ek User Defined Data Type hai.

2. Student class ke andar related data ko group kiya gaya hai:
      • name
      • rollNo
      • cgpa

3. Har object ki apni alag copy hoti hai instance variables ki.

   Example:
      s1 → Aryan
      s2 → Atharv
      s3 → User Input

4. Scanner user se runtime input lene ke liye use hota hai.


Object Creation:
Student s1 = new Student();
Student → User Defined Data Type
s1      → Reference Variable
new     → Memory Allocate karta hai
Student() → Constructor Call


Important Points:
1. Class = User Defined Data Type.
2. Object = Instance of Class.
3. Har object independent hota hai.
4. Object ke through instance variables access hote hain.
5. Scanner ko use ke baad close karna good practice hai.

Interview Points:
✓ Primitive Data Types:
   int, double, char, boolean

✓ User Defined Data Types:
   Class, Interface, Enum

✓ Har object ki apni state hoti hai.

Easy Revision:
Class      → Blueprint
Object     → Instance
new        → Memory Allocation
Scanner    → User Input
print()    → Behaviour

*/