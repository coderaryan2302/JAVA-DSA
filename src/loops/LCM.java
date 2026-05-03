package loops;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("LCM is undefined");
        }
        else if (a == 0 || b == 0) {
            System.out.println("lcm = 0");
        }
        else {
            int lcm = 1;
            for (int i = 1; i <= a * b; i++) {
                if (i % a == 0 && i % b == 0) {
                    lcm = i;
                    break;
                }
            }
            System.out.println("lcm = " + lcm);
        }
    }
}

/*
1. Math.abs(n) → number ko positive banata hai
2. Negative ho to sign hata deta hai (-123 → 123)
3. Positive ho to same rehta hai
4. "n =" se updated value store hoti hai
5. Isse recursion me negative numbers bhi sahi handle hote hain
*/