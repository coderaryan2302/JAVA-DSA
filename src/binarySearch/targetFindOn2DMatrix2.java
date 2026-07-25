package binarySearch;

import java.util.Scanner;

public class targetFindOn2DMatrix2 {

    // Target ke sabhi indices print karega
    static void targetFinding(int[][] matrix, int target) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0;
        int column = columns - 1;

        while (row < rows && column >= 0) {

            if (matrix[row][column] == target) {

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

            if (target < matrix[row][column]) {
                column--;
            } else {
                row++;
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
Target Finding in 2D Matrix (Row-wise and Column-wise Sorted)

Definition
• Row-wise aur Column-wise sorted matrix me target element find karta hai.

Working
• Search top-right corner se start hoti hai.
• Agar current element target ke barabar ho to uske sabhi indices print karo.
• Agar target chhota ho to left move karo.
• Agar target bada ho to down move karo.
• Jab matrix ke bahar pahunch jao aur target na mile to target present nahi hai.

Key Points
• Har row ascending order me sorted honi chahiye.
• Har column ascending order me sorted hona chahiye.
• Top-right corner se search karna sabse efficient approach hai.
• Duplicate target milne par sabhi indices print kiye jate hain.

Edge Cases
• Invalid input (rows <= 0 or columns <= 0)
• Single row
• Single column
• Single element
• Duplicate target elements
• Target present na ho

Time Complexity : O(rows + columns)
Space Complexity : O(1)

Revision
• Start From Top-Right Corner
• Target < Current → Move Left
• Target > Current → Move Down
• Target == Current → Print All Indices
*/