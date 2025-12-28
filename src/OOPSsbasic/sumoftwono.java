package OOPSsbasic;
import java.util.Scanner;
class Sum {

//    Sum(){
//        System.out.println("constructor of sum is called");
//    }
//here it is default constructor made by user...

    public  int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class sumoftwono {
    public static void main(String[] args) {
        Sum obj=new Sum();// here sum() is default construtors also
        Scanner sc=new Scanner (System.in);

        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("enter y");
        int y= sc.nextInt();

        int ans = obj.add(x,y);
        System.out.println("sum of input no is " + ans);
    }
}
