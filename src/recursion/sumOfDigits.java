package recursion;
import java.util.Scanner;
public class sumOfDigits {

    static int sum(int n) {
        if (n>=0 && n<=9){
            return n;
        }
        else{
            return sum(n/10)+(n%10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
