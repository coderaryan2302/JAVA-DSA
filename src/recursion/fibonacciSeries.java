package recursion;
import java.util.Scanner;
public class fibonacciSeries {

    static int fibonacci(int n) {
        if ( n == 0 || n == 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nth fibonacci no.");
        int n = sc.nextInt();

        if (n<0){
            System.out.println("Invalid input");
            return ;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}

// Fibonacci series using 0-based indexing (0 is the 0th term)
