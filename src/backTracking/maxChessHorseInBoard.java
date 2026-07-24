package backTracking;

public class maxChessHorseInBoard {

    static int n = 4;
    static int maxKnights = 0;

    // Find Maximum Knights
    static void maximumKnights(boolean[][] board, int row, int col, int count) {

        if (row == n) {                        // Board complete

            if (count > maxKnights) {

                maxKnights = count;
                System.out.println("Maximum Knights = " + maxKnights);
                display(board);
                System.out.println();
            }
            return;
        }

        if (col == n) {                        // Next row
            maximumKnights(board, row + 1, 0, count);
            return;
        }

        if (isSafe(board, row, col)) {

            board[row][col] = true;            // Place Knight
            maximumKnights(board, row, col + 1, count + 1);
            board[row][col] = false;           // Backtracking
        }

        maximumKnights(board, row, col + 1, count); // Skip cell
    }

    // Safe position check
    static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(row - 2, col - 1) && board[row - 2][col - 1]) return false;
        if (isValid(row - 2, col + 1) && board[row - 2][col + 1]) return false;
        if (isValid(row - 1, col - 2) && board[row - 1][col - 2]) return false;
        if (isValid(row - 1, col + 2) && board[row - 1][col + 2]) return false;

        return true;
    }

    // Boundary check
    static boolean isValid(int row, int col) {

        return row >= 0 && row < n &&
                col >= 0 && col < n;
    }

    // Display board
    static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean cell : row)
                System.out.print(cell ? "K " : ". ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        boolean[][] board = new boolean[n][n];

        maximumKnights(board, 0, 0, 0);

        System.out.println("Final Maximum Knights = " + maxKnights);
    }
}

/*

Maximum Knights

Definition

• N × N Chess Board par maximum Knights place karni hoti hain.
• Koi bhi 2 Knights ek dusre ko attack nahi karni chahiye.
• Ye Backtracking + Optimization problem hai.

Difference

• Knight Tour → Har cell visit hoti hai.
• N Knights → Exactly N Knights place hoti hain.
• Maximum Knights → Jitni possible ho utni Knights place hoti hain.

Approach

1. Har cell visit karo.
2. Safe ho to Knight place karo.
3. Count increase karke recursive call karo.
4. Board end par maximum count update karo.
5. Knight hatao (Backtracking) aur next position try karo.

Safety Check

• Sirf upper positions check hoti hain.
• Kyuki lower cells abhi empty hoti hain.

Base Case

row == n

• Board complete ho gaya.
• Agar current count bada ho to maximum update karo.

Time Complexity

• O(2^(N × N))

Space Complexity

• O(N × N)

Advantages

• Optimal solution find karta hai.
• Backtracking aur optimization practice ke liye useful.

Disadvantages

• Exponential time.
• Large board ke liye slow.

Applications

• Chess Problems
• Optimization Problems
• Constraint Satisfaction
• Puzzle Solving

*/