package loops;
import java.util.Scanner;
public class countThedigits {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int count=0;
        System.out.println("enter n");
        int n=sc.nextInt();

        for(;n>0;){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }

}
