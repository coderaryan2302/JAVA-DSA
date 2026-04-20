package multidimensionalArrays;
import java.util.Scanner;
public class prefixSum2 {

    // prefix sum method-2 pre calculating the horizontal sum for each row

    static void findPrefixSum(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;                                       // if (r>0) case mai chalega ye

        // traverse horizontally to calculate row wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];        // current element me uske left ka sum add kiya
            }
        }

    }

    static int totalsum(int matrix[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        findPrefixSum(matrix);                                         // pehle har row ka prefix sum bana liya

        for (int i = r1; i <= r2; i++) {                               // r1 se r2 tak har row ko process kar rahe hain
            if (r1 >= 1) {
                sum = sum + matrix[i][r2] - matrix[i][r1 - 1];         // prefix ka use karke range sum nikal rahe hain (left part subtract karke)
            } else {
                sum = sum + matrix[i][r2];                             // prefix ka use karke range sum nikal rahe hain (left part subtract karke)
            }
        }
        return sum;
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


