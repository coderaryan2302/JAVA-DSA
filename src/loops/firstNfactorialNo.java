package loops;
import java.util.Scanner;
public class firstNfactorialNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int factorial=1;
        while(n>0){
            factorial=factorial*n;
            n--;
        }
        System.out.println(factorial);
    }
}
