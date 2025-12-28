package patternprinting;
import java.util.Scanner;
public class continusnoinformofrectangleorsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
