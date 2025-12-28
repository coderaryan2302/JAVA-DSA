package loops;
import java.util.Scanner;
public class atothepowerb {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();

        int power=1;
        while(b>0){
            power=power*a;
            b--;
        }
        System.out.println(power);
    }
}
