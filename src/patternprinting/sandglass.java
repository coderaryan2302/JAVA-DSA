package patternprinting;
import java.util.Scanner;
public class sandglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=r;j>=i;j--){
                System.out.print("*");
            }
            for(int j=r-1;j>=i;j--){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=2; i<=r; i++){
            for(int j=r;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
