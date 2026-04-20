package multidimensionalArrays;
import java.util.Scanner;
public class generateSpiralMatrix {

    static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int r , int c){
        int matrix [][]=new int[r][c];
        int toprow=0;
        int bottomrow=r-1;
        int leftcolumn=0;
        int rightcolumn=c-1;
        int current=1;

        while(current <= r*c){
            //toprow = leftcolumn to rightcolumn
            for (int j = leftcolumn; j <= rightcolumn && current <= r*c ; j++) {
                matrix[toprow][j] = current;
                current++;
            }
            toprow++;

            //rightcolumn = toprow to bottomrow
            for (int i = toprow; i <= bottomrow && current <= r*c ; i++) {
                matrix[i][rightcolumn] = current;
                current++;
            }
            rightcolumn--;

            //bottomrow = rightcolumn to leftcolumn
            for (int j = rightcolumn; j >= leftcolumn && current <= r*c; j--) {
                matrix[bottomrow][j] = current;
                current++;
            }
            bottomrow--;

            //leftcolumn = bottomrow to toprow
            for (int i = bottomrow; i >= toprow && current <= r*c ; i--) {
                matrix[i][leftcolumn] = current;
                current++;
            }
            leftcolumn++;

        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter rows ");
        int r=sc.nextInt();
        System.out.println("enter columns ");
        int c=sc.nextInt();

        int matrix[][]=new int[r][c];

        matrix = generateSpiralMatrix(r,c);
        System.out.println("print generate spiral matrix");
        printMatrix(matrix);
    }
}


