package loops;
import java.util.Scanner;
public class sumofstreamofno {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num;
             num =sc.nextInt();

        }
        System.out.println(sum);
    }
}
