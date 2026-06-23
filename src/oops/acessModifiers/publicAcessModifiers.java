package oops.acessModifiers;
class Student {
    public String name = "Aryan";         // Accessible everywhere
    }

    public class publicAcessModifiers {
        public static void main(String[] args) {
            Student s = new Student();
            System.out.println(s.name);   // Direct access allowed
        }
    }

/*
Important Points:
1. public members ko kahin se bhi access kar sakte hain.
2. Sabse zyada accessibility hoti hai.

Example:
Public Road → Sab use kar sakte hain.
*/

