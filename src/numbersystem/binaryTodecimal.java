package numbersystem;
import java.util.Scanner;
public class binaryTodecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter binary no");
        int binary_no =sc.nextInt();

        int ans=0; //converted decimal no.

        int power=1; //2^0=1 (power of 2)

        while(binary_no>0){
            int unit_digit=binary_no % 10;
            ans=ans+(unit_digit*power);
            binary_no = binary_no / 10;
            power=power*2;
        }
        System.out.println(ans);
    }
}
