package loops;
import java.util.Scanner;
public class HCF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int x = sc.nextInt();
        System.out.println("enter b ");
        int y = sc.nextInt();

        x = Math.abs(x);
        y = Math.abs(y);

        if (x == 0 && y == 0) {
            System.out.println("HCF is undefined");
            return;
        }

        // Euclidean Algorithm
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        System.out.println("hcf = " + x);
    }
}

/*
1. Math.abs(n) → number ko positive banata hai
2. Negative ho to sign hata deta hai (-123 → 123)
3. Positive ho to same rehta hai
4. "n =" se updated value store hoti hai
5. Isse recursion me negative numbers bhi sahi handle hote hain
*/