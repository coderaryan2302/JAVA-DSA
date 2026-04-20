package multidimensionalArrays;
import java.util.Scanner;
public class prefixSum {

    // prefix sum method-1 brute force

    static int totalsum (int matrix[][],int r1, int c1, int r2, int c2) {
        int sum = 0;                             // total sum store karne ke liye variable banaya
        for (int i = r1 ; i <= r2 ; i++) {       // rows r1 se r2 tak traverse kar rahe hain
            for (int j = c1 ; j <= c2 ; j++) {   // columns c1 se c2 tak traverse kar rahe hain
                sum = sum+matrix[i][j];          // har element ko sum me add kar rahe hain
            }
        }
        return sum;                              // final calculated sum return kar diya
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        System.out.println("enter columns");
        int columns = sc.nextInt();

        int matrix[][]=new int [rows][columns];

        System.out.println("enter elements");
        for (int i = 0; i < rows  ; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter boundaries");
        System.out.println("enter r1");
        int r1 = sc.nextInt();
        System.out.println("enter c1");
        int c1 = sc.nextInt();
        System.out.println("enter r2");
        int r2 = sc.nextInt();
        System.out.println("enter c2");
        int c2 = sc.nextInt();

        System.out.println("total sum " + totalsum(matrix,r1,c1,r2,c2) );
    }
}
