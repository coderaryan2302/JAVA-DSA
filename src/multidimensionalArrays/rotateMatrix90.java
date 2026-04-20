package multidimensionalArrays;
import java.util.Scanner;
public class rotateMatrix90 {
    static void printMatrix(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] anstransposeMatrix(int matrix[][],int r , int c) {
        int ans[][] = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }


    static void reverseArray (int arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int [][] rotate (int matrix[][],int r,int c){
       int ans[][]= anstransposeMatrix(matrix,r,c);
        for (int i = 0; i < c; i++) {
            reverseArray (ans[i]);
        }
        return ans;
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
        matrix= rotate(matrix,r,c);
        System.out.println("Rotate Matrix");
        printMatrix(matrix);
    }
}

