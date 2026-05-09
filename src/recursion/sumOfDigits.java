package recursion;
import java.util.Scanner;
public class sumOfDigits {

    static int sum(int n) {
        n = Math.abs(n);
        if (n>=0 && n<=9){                 // base case: agar n single digit ka hai to wahi return karo
            return n;
        }
        else{
            return sum(n/10)+(n%10);    // self work + recursive call: n/10 se last digit hata do aur n%10 se last digit nikal lo, dono ko add karke return karo
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}

/*
1. Math.abs(n) → number ko positive banata hai
2. Negative ho to sign hata deta hai (-123 → 123)
3. Positive ho to same rehta hai
4. "n =" se updated value store hoti hai
5. Isse recursion me negative numbers bhi sahi handle hote hain
*/