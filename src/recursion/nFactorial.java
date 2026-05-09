package recursion;
import java.util.Scanner;
public class nFactorial {

    static int factorial(int n) {
        if (n == 0) {           // base case: factorial of 0 is 1
            return 1;
        }
            return n * factorial(n - 1);   // self work + recursive call: n * factorial of (n-1)

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n factorial no.");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined");
            return ;
        }
        System.out.println(factorial(n));
    }
}
