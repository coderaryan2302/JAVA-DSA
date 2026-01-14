package conditionals;
import java.util.Scanner;
public class switchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter condition");
        int condition=sc.nextInt();

        switch (condition){

            case 1:
                int a=2;
                int b=3;
                int sum=a+b;
                System.out.println(sum);
                break;

            case 2:
                int c=4;
                int d=5;
                int multiply=c*d;
                System.out.println(multiply);
                break;

            case 3:
                int e=7;
                int f=8;
                int subtraction=e-f;
                System.out.println(subtraction);
                break;

            case 4:
                int x=9;
                int y=3;
                int divide = x/y;
                System.out.println(divide);
                break;

            default:
               System.out.println("invalid");

        }
    }

}
