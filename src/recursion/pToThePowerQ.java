package recursion;
import java.util.Scanner;
public class pToThePowerQ {

    // method 1
    static int power(int p , int q) {
        if (q == 0) {                     // base case: any number to the power of 0 is 1
            return 1;
        }
        if (q == 1) {                     // base case: any number to the power of 1 is the number itself
            return p;
        }
        return p * power(p, q - 1);    // self work + recursive call: p * power of (p to the power of (q-1))

    }

    // method 2
    static int power2(int p, int q){
        if(q==0){                     // base case: any number to the power of 0 is 1
            return 1;
        }
        if(q==1){                     // base case: any number to the power of 1 is the number itself
            return p;
        }

        int ans = power2(p, q/2);     // recursive call: power of (p to the power of (q/2))
        if (q % 2 == 0){                 // self work: if q is even, then p^q = (p^(q/2))^2
            return ans * ans;
        }
        return p * ans * ans;            // self work: if q is odd, then p^q = p * (p^(q/2))^2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base p ");
        int p = sc.nextInt();
        System.out.println("enter power q ");
        int q = sc.nextInt();

        if (q < 0) {
            System.out.println("Negative power not supported");
            return;
        }

        System.out.println("method 1 : " + power(p, q));
        System.out.println("method 2 : " + power2(p, q));
    }
}

/*
 this code is not for negative power ( q<0 ) ...
 negative power means divide and value in decimal ...
 */
