package binarySearch;

import java.util.Scanner;

public class targetFindOn2Dmatrix {

    // Target ke sabhi indices print karega
    static void targetFinding(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int start = 0;
        int end = rows * columns - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int middleElement = matrix[mid / columns][mid % columns];

            if (middleElement == target) {

                System.out.println("Target Indices =");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (matrix[i][j] == target) {
                            System.out.println("[" + i + "][" + j + "]");
                        }
                    }
                }
                return;
            }

            if (target < middleElement) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Target Not Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter sorted matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        targetFinding(matrix, target);
    }
}

/*
Target Finding in 2D Matrix

Definition
• Sorted 2D Matrix me Binary Search ki help se target element find karta hai.

Working
• Matrix ko virtual 1D sorted array ki tarah treat kiya jata hai.
• Middle index se row aur column calculate kiye jate hain.
• Agar target mil jaye to uske sabhi indices print kiye jate hain.
• Agar target chhota ho to left half search karo.
• Agar target bada ho to right half search karo.

Key Points
• Matrix sorted hona chahiye.
• Har row ascending order me sorted honi chahiye.
• Current row ka last element next row ke first element se chhota ya barabar hona chahiye.
• Row Index = mid / columns
• Column Index = mid % columns

Edge Cases
• Invalid input (rows <= 0 or columns <= 0)
• Single row
• Single column
• Single element
• Duplicate target elements
• Target present na ho

Time Complexity : O(log(rows × columns))
Space Complexity : O(1)

Revision
• Treat Matrix as Virtual 1D Array
• Row = mid / columns
• Column = mid % columns
• Target < Middle → Search Left
• Target > Middle → Search Right
• Target == Middle → Print All Indices
*/