package patternprinting;
import java.util.Scanner;
public class continusNumberrectangleOrsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r= sc.nextInt();
        System.out.println("enter c");
        int c= sc.nextInt();

        int num=1;

        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
