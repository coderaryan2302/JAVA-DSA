package recursion;
import java.util.Scanner;
public class kMultipleOfN {

    static void increasingOrderMultiple(int n, int k) {
        if (k == 0) {                              // base case
            return;
        }
        increasingOrderMultiple(n, k - 1);      // recursive call
        System.out.println(n * k);                 // self work: n*k ko khud print kiya
    }

    static void decreasingOrderMultiple(int n, int k) {
        if (k == 0) {                             // base case
            return;
        }
        System.out.println(n * k);                // self work: n*k ko khud print kiya
        decreasingOrderMultiple(n, k - 1);     // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter k multiple");
        int k = sc.nextInt();

        System.out.println("increasing order multiple");
        increasingOrderMultiple(n, k);
        System.out.println("decreasing order multiple");
        decreasingOrderMultiple(n, k);
    }
}


