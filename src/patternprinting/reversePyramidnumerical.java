package patternprinting;
import java.util.Scanner;
public class reversePyramidnumerical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r=sc.nextInt();

        for(int i=r;i>=1;i--){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
               System.out.print(j);
           }
            System.out.println();
        }
    }
}
