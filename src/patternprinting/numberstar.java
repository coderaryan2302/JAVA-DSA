package patternprinting;
import java.util.Scanner;
public class numberstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r= sc.nextInt();

        //pattern1
//        for(int i=1;i<=r;i++){
//            System.out.print(i);
//            for(int j=1;j<i;j++){        // j<=1 kiye to 1 ke sath star print krega. j<1 kiye to 2 ke sath star print krega
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //pattern2
//          for(int i=1;i<=r;i++){
//              for(int j=1;j<=i;j++){
//                  System.out.print(j);
//              }
//              System.out.print("*");
//              System.out.println();
//          }
    }
}
