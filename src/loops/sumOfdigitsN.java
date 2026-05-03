package loops;
import java.util.Scanner;
public class sumOfdigitsN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int count = n % 10;    // modulo ka mtlb hai remainder
            sum = sum + count;
            n = n / 10;            // divide ka mtlb hai last digit ko hatana
        }
        System.out.println(sum);
    }
}

/*
 isme sabse phle input liye hai uske badd sum intialise kiye zero se
 uske bdd loop ka condition check hua agr true hai
 uske bdd loop mai  entry kiye hai
 count name ka box bana usme remainder store hua
 uske bdd sum operation involve hua phir uske bdd last digit remove hua hai divide krke uske bdd phir se loop chalega ....
*/

/*
1. Math.abs(n) → number ko positive banata hai
2. Negative ho to sign hata deta hai (-123 → 123)
3. Positive ho to same rehta hai
4. "n =" se updated value store hoti hai
5. Isse recursion me negative numbers bhi sahi handle hote hain
*/
