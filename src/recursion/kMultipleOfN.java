package recursion;
import java.util.Scanner;
public class kMultipleOfN {

    static void increasingOrderMultiple(int n, int k) {
        if (k == 0) {
            return;
        }
        increasingOrderMultiple(n, k - 1);
        System.out.println(n * k);
    }

    static void decreasingOrderMultiple(int n, int k) {
        if (k == 0) {
            return;
        }
        System.out.println(n * k);
        decreasingOrderMultiple(n, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter k multiple");
        int k = sc.nextInt();

        System.out.println("increassing order multiple");
        increasingOrderMultiple(n, k);
        System.out.println("decreasing order multiple");
        decreasingOrderMultiple(n, k);
    }
}


