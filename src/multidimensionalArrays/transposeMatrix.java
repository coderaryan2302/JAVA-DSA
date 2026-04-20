package multidimensionalArrays;
import java.util.Scanner;
public class transposeMatrix {
    static void printMatrix(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void anstransposeMatrix(int matrix[][],int r , int c){
        int ans[][] = new int [c][r];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ans[j][i]=matrix[i][j];     //row aur column swap
            }
        }
        printMatrix(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter r");
        int r=sc.nextInt();
        System.out.println("enter c");
        int c=sc.nextInt();

        int matrix[][]=new int[r][c];

        System.out.println("enter elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("print orginal matrix");
        printMatrix(matrix);

        System.out.println("Transpose Matrix");
        anstransposeMatrix(matrix,r,c);
    }
}
