package recursion;
import java.util.Scanner;
public class countOfDigits {

    static int count(int n){
        n = Math.abs(n);
        if (n >= 0 && n <= 9){              // base case: single digit number
            return 1;
        }
        else {
            return 1 + count(n/10);      // self work + recursive call: n/10 se last digit remove hota hai
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}


/*
1. Math.abs(n) → number ko positive banata hai
2. Negative ho to sign hata deta hai (-123 → 123)
3. Positive ho to same rehta hai
4. "n =" se updated value store hoti hai
5. Isse recursion me negative numbers bhi sahi handle hote hain
*/