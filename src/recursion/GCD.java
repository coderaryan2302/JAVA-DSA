package recursion;
import java.util.Scanner;
public class GCD {

    // Euclidean algorithm
    static int gcd(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        if (x == 0 && y == 0) {
            return -1;         // -1 means undefined
        }
        if (y==0){            // base case
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        System.out.println("gcd = " + gcd(x,y));
    }
}

/*
1. Math.abs(n) → number ko positive banata hai
2. Negative ho to sign hata deta hai (-123 → 123)
3. Positive ho to same rehta hai
4. "n =" se updated value store hoti hai
5. Isse recursion me negative numbers bhi sahi handle hote hain
*/
