package loops;
import java.util.Scanner;
public class multiplicationofnnaturalno {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int product=1;

        int num=1;

        while(num<=n) {
            product = product * num;
            num++;
        }
        System.out.println(product);

    }
}
