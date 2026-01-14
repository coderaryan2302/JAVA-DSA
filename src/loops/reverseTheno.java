package loops;
import java.util.Scanner;
public class reverseTheno {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            reverse=n%10;
            n=n / 10;
            System.out.print(reverse);
        }


    }
}
