package oops.acessModifiers;
class Student3 {
    String college = "IES";     // Default access
}

public class defaultAcessModifiers {
    public static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.college);
    }
}

/*
Important Points:
1. Koi modifier na likho to default access hota hai.
2. Sirf same package ke andar accessible hota hai.

Example:
TV at Home → Ghar wale use kar sakte hain.
*/