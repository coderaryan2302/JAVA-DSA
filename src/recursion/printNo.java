package recursion;
import java.util.Scanner;
public class printNo {

    static void printNo1toN(int n){
        if (n==0){                                        // base case
            return;
        }
        else {
            printNo1toN(n-1);                          // recursive call
            System.out.println(n);                        // self work
        }
    }

    static void printNoNto1(int n){
        if (n==0){                                        // base class
            return;
        }
        else {
            System.out.println(n);                        // self work
            printNoNto1(n-1);                          // recursive call 
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        System.out.println("print in ascending order");
        printNo1toN(n);

        System.out.println("print in descending order");
        printNoNto1(n);
    }
}
