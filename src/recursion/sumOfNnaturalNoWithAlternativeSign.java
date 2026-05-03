package recursion;
import java.util.Scanner;
public class sumOfNnaturalNoWithAlternativeSign {

    static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 0) {                   //even
            return sum(n - 1) - n;       //-ve sign with no.
        }
        else {
            return sum(n - 1) + n;       //odd
        }                                   //+ve sign with no.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("sum = " + sum(n));
    }
}
