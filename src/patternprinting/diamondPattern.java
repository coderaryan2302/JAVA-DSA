package patternprinting;
import java.util.Scanner;
public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r");
        int r = sc.nextInt();

        // upper part
        for (int i=1; i<=r; i++) {

            for (int j=r;j>=i;j--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int j=2;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       // lower part
        for (int i=2;i<=r;i++) {

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
    }
}



// 25no line code mai int i=1 isliye nhi liya gaya hai kyuki repeat kar raha hai 7star wale line ko output mai ..
// hum wo line 7star wli ko skip krne ke liye int i=2 se liye hai