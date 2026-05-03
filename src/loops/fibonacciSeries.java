package loops;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("invalid input");
        }

        else {
            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}

// Fibonacci series using 0-based indexing (0 is the 0th term)
