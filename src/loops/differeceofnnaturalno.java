package loops;
import java.util.Scanner;
public class differeceofnnaturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        int num=n-1;
        int difference = n;
        while(num>=1){
            difference = difference - num;
            num--;
        }
        System.out.println(difference);
        }
    }

