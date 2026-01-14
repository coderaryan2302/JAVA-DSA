package patternprinting;
import java.util.Scanner;
public class numberStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r= sc.nextInt();

        System.out.println("pattter 1");
        for(int i=1;i<=r;i++){
            System.out.print(i);
            for(int j=1;j<i;j++){        // j<=1 kiye to 1 ke sath star print krega. j<1 kiye to 2 ke sath star print krega
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("pattter 2");
          for(int i=1;i<=r;i++){
              for(int j=1;j<=i;j++){
                  System.out.print(j);
              }
              System.out.print("*");
              System.out.println();
          }
    }
}
