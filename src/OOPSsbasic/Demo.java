package OOPSsbasic;

class Student {                   //khud se hum class create kr diye hai khud se name choose kr ke
    int rollno=48;
    String studentName="Aryan";
}

public class Demo{               // ye main class hai
    public static void main(String[] args) {
        Student obj1=new Student();
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentName);

        Student obj2=new Student();
        obj2.rollno=60;
        obj2.studentName="Atharv";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentName);
    }
}


// ek main class mai kitne obj bna skte hai

// java file ke mutliple class ho skti hai pr public class sirf ek ho gi or public class ka name hee java file ka name ho ga
// isliye isme student jaisi bhtt class bana skte hai pr public class demo sirf ek hee ho ga jo java file name rahega....