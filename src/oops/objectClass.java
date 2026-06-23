package oops;
class Student6 {
    String name;
    int rollNo;

    Student6(String name, int rollNo) {
        this.name = name;          // Initialize name
        this.rollNo = rollNo;      // Initialize roll number
    }
    @Override
    public String toString() {
        return name + " - " + rollNo;    // String representation
    }
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;       // Type Casting
        return this.rollNo == s.rollNo;
    }
}

public class objectClass {
    public static void main(String[] args) {

        Student6 s1 = new Student6("Aryan", 48);
        Student6 s2 = new Student6("Atharv", 48);

        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));

        System.out.println(s1.getClass());

        System.out.println(s1.hashCode());
    }
}

/*
OBJECT CLASS

Object Class:
→ Java ki sabse parent class hai.

Methods:

1. toString()
   Object ko String me convert karta hai.

2. equals()
   Objects compare karta hai.

3. hashCode()
   Object ka hash value return karta hai.

4. getClass()
   Object ki class batata hai.

Important Points:

1. Har class Object ko inherit karti hai.
2. Object class java.lang package me hoti hai.
3. equals() aur toString() commonly override kiye jate hain.

Easy Revision:

Object
↓
toString()
equals()
hashCode()
getClass()

Golden Line:
"Object class is the root class of Java."

*/