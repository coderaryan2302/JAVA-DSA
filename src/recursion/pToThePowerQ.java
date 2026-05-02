package recursion;
import java.util.Scanner;
public class pToThePowerQ {

    // method 1
    static int power(int p , int q){
        if(q==0){
            return 1;
        }
        return p * power(p, q-1);
    }

    // method 2
    static int power2(int p, int q){
        if(q==0){
            return 1;
        }

        else if (q%2==0){      //even
            return power2(p, q/2) * power2(p, q/2);
        }
        else {                // odd
            return p * power2(p, q/2) *  power2(p, q/2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p ");
        int p = sc.nextInt();
        System.out.println("enter power q ");
        int q = sc.nextInt();
        System.out.println("method 1 : " + power(p, q));
        System.out.println("method 2 : " + power2(p, q));
    }
}
