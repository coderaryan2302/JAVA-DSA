package numbersystem;
import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter decimal_no");
        int decimal_no=sc.nextInt();

        int ans=0; // binary no

        int power=1; // powers of 10

        while(decimal_no>0){
            int a=decimal_no % 2;
            ans=ans+(a*power);
            power=power*10;
            decimal_no = decimal_no / 2;
        }
        System.out.println(ans);
    }
}
