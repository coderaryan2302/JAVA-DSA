package patternprinting;
import java.util.Scanner;
public class characterPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r");
        int r=sc.nextInt();

        System.out.println("pattern1");
        char ch='A';
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("pattern2");
          for(int i=1;i<=r;i++){
              char ch2='A';
              for(int j=1;j<=i;j++){
                  System.out.print(ch2);
                  ch2++;
              }
              System.out.println();
          }
    }
}
