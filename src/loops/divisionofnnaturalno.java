package loops;
import java.util.Scanner;
public class divisionofnnaturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        double divide=n;

        int num=n-1;

        while(num>=1) {
            divide = divide / num;
            num--;
        }
        System.out.println(divide);

    }
}



