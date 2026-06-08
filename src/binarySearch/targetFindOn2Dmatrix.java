package binarySearch;
import java.util.Scanner;
public class targetFindOn2Dmatrix {

    static void targetFinding(int matrix[][] , int target){
            int r = matrix.length;
            int c = matrix[0].length;
            int start = 0;
            int end = r * c - 1;

            while (start <= end ){
                int mid = start + (end - start)/2;
                int middleElement = matrix[mid / c][mid % c];

                if (middleElement == target){
                    System.out.println("Target found at index: ");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            if (matrix[i][j] == target) {
                                System.out.println("[" + i + "][" + j + "]");
                            }
                        }
                    }
                    return;
                }

                if (target < middleElement){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
        System.out.println("target not found");
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
Works when the matrix can be viewed as a single sorted array.
Example:
1 2 3
4 5 6
7 8 9

Valid:
last element of a row <= first element of next row.

Logic:
Treat Matrix As A Virtual 1D Sorted Array.
Row = mid / column
Col = mid % column

Important:
Works Only When
Last Element Of Current Row <= First Element Of Next Row

Complexity:
Time -> O(log(r*c))
Space -> O(1)
*/