package recursion;
import java.util.Scanner;
public class sumOfNnaturalNoWithAlternativeSign {

    static int sum(int n) {
        if (n <= 0) {                       // base case
            return 0;
        }
        if (n % 2 == 0) {                   //even
            return sum(n - 1) - n;       // self work + recursive work: subtract current number from the sum of previous numbers
        }
        else {                              // odd
            return sum(n - 1) + n;       // self work + recursive work: add current number to the sum of previous numbers
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("sum = " + sum(n));
    }
}
