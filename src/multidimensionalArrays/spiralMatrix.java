package multidimensionalArrays;
import java.util.Scanner;
public class spiralMatrix {

    static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void spiralMatrix(int matrix[][],int r,int c){
        int toprow=0;
        int bottomrow=r-1;
        int leftcolumn=0;
        int rightcolumn=c-1;
        int totalelements=0;
        
        while(totalelements < r*c){
            //toprow = leftcolumn to rightcolumn
            for (int j = leftcolumn; j <= rightcolumn && totalelements < r*c ; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalelements++;
            }
            toprow++;

            //rightcolumn = toprow to bottomrow
            for (int i = toprow; i <= bottomrow && totalelements < r*c ; i++) {
                System.out.print(matrix[i][rightcolumn] + " ");
                totalelements++;
            }
            rightcolumn--;

            //bottomrow = rightcolumn to leftcolumn
            for (int j = rightcolumn; j >= leftcolumn && totalelements < r*c; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                totalelements++;
            }
            bottomrow--;

            //leftcolumn = bottomrow to toprow
            for (int i = bottomrow; i >= toprow && totalelements < r*c ; i--) {
                System.out.print(matrix[i][leftcolumn] + " ");
                totalelements++;
            }
            leftcolumn++;

        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter rows ");
        int rows=sc.nextInt();
        System.out.println("enter columns ");
        int columns=sc.nextInt();

        int matrix[][]=new int[rows][columns];

        System.out.println("enter elements");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("print orginal matrix");
        printMatrix(matrix);

        System.out.println("print spiral matrix");
        spiralMatrix(matrix,rows,columns);

    }
}
