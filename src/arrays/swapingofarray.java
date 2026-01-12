package arrays;
import java.util.Scanner;
public class swapingofarray {

    static void basicswaping (int a,int b) {


        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:  a = " + a + ", b = " + b);
    }


    static void swapwithouttemp (int a,int b) {

        System.out.println("Before swaping: a = " + a + ", b = " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:  a = " + a + ", b = " + b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();


        System.out.println("basicswaping");
        basicswaping(a,b);

        System.out.println("swapwithouttemp");
        swapwithouttemp(a,b);
    }
}
