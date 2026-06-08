package binarySearch;
import java.util.Scanner;
public class targetFindOn2DMatrix2 {

    static void targetFinding(int matrix[][] , int target){
        int r = matrix.length;
        int c = matrix[0].length;
        int i = 0;
        int j = c-1;

        while(i < r && j >= 0){
            if (matrix[i][j] == target){
                System.out.println("target found at index: ");
                for (int k = 0; k < r; k++) {
                    for (int l = 0; l < c; l++) {
                        if (matrix[k][l] == target) {
                        System.out.println("[" + k + "][" + l + "]");
                        }
                    }
                }
                return;
            }
            if (target < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("target not found ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row ");
        int r = sc.nextInt();
        System.out.println("enter column ");
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Invalid matrix size");
            return;
        }

        int matrix[][] = new int[r][c];

        System.out.println("enter sorted elements ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter target ");
        int target = sc.nextInt();

        targetFinding(matrix,target);
    }
}

/*
Works when the matrix is sorted row-wise and column-wise.
Example:
1 4 7
2 5 8
3 6 9

Valid:
Each row is sorted from left to right.
Each column is sorted from top to bottom.

Logic:
Start From Top Right Corner.
target < current -> Move Left
target > current -> Move Down
target == current -> Found

Important:
Each Row Must Be Sorted.
Each Column Must Be Sorted.

Complexity:
Time -> O(r + c)
Space -> O(1)
*/