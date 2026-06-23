package oops.acessModifiers;
class Student2 {
    private int rollNo;                                   // Direct access not allowed
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
}

public class privateAcessModifiers {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setRollNo(48);
        System.out.println(s.getRollNo());

        // s.rollNo = 48;   // Error
    }
}

/*
Important Points:

1. private members sirf same class me accessible hote hain.
2. Getter aur Setter controlled access dete hain.
3. Encapsulation achieve hota hai.

Example:
Mobile Password → Sirf owner access kar sakta hai.
*/