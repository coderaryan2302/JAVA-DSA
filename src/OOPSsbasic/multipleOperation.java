package OOPSsbasic;
class Algebra {
    int a;
    int b;

    Algebra(int x, int y) {
        a = x;
        b = y;
        System.out.println("constructor called");

    }

    int add() {
        int ans1 = a + b;
        return ans1;
    }

    int sub() {
        int ans2 = a - b;
        return ans2;
    }

    int multiply() {
        int ans3 = a * b;
        return ans3;
    }
}

public class multipleOperation {
    public static void main(String[] args) {
    Algebra obj1=new Algebra(5,7);

    int ans1=obj1.add();
    System.out.println(ans1);

    int ans2=obj1.sub();
    System.out.println(ans2);

    int ans3=obj1.multiply();
    System.out.println(ans3);



    Algebra obj2=new Algebra(10,4);

    int ans4=obj2.add();
    System.out.println(ans4);

    int ans5=obj2.sub();
    System.out.println(ans5);

    int ans6=obj2.multiply();
    System.out.println(ans6);

    }
}
