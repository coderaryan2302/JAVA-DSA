package arrays;
import java.util.Scanner;
public class swapingofarray {

    static void basicswaping (int a,int b) {

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;  // temp me a ki value store kar li
        a = b;         // a me b ki value daal di
        b = temp;      // b me temp (old a) ki value daal di
        System.out.println("After swapping:  a = " + a + ", b = " + b);
    }


    static void swapwithouttemp (int a,int b) {

        System.out.println("Before swaping: a = " + a + ", b = " + b);

        a=a+b;           // a = a + b (dono ka sum)
        b=a-b;           // b = a - b (old a mil jayega)
        a=a-b;           // a = a - b (old b mil jayega)
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
