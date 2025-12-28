package loops;
import java.util.Scanner;
public class firstmultipleof5whichismultipleof7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 5, b = 7;
        for (int i = 1; i <= n;i++ ) {
            if ((i % a == 0) && (i % b == 0)) {
                System.out.println("found ans" + i);
                return;
            }
        }
            System.out.println("not found");
    }
}
