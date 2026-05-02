package recursion;
import java.util.Scanner;
public class countOfDigits {

    static int count(int n){
        if (n>=0 && n<=9){
            return 1;
        }
        else {
            return 1 + count(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
