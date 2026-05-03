package recursion;
import java.util.Scanner;
public class sumOfNnaturalNo {

    static int sum(int n){
        if (n <= 0){
            return 0;
        }
         return n + sum (n-1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n natural no. :");
        int n = sc.nextInt();
        System.out.println("sum = " + sum(n));
    }
}
