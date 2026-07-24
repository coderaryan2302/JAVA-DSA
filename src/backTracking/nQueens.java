package backTracking;

public class nQueens {

    // N Queens
    static void nQueens(char[][] board, int row) {

        if (row == board.length) {      // All Queens placed
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';          // Place Queen
                nQueens(board, row + 1);
                board[row][col] = 'X';          // Backtracking
            }
        }
    }

    // Safe position check
    static boolean isSafe(char[][] board, int row, int col) {

        // Up
        for (int i = row - 1; i >= 0; i--)
            if (board[i][col] == 'Q') return false;

        // Upper Left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Upper Right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    // Display board
    static void display(char[][] board) {

        for (char[] row : board) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 'X';

        nQueens(board, 0);
    }
}

/*

N Queens

Definition

• N × N Chess Board par N Queens place karni hoti hain.
• Koi bhi 2 Queens ek dusre ko attack nahi karni chahiye.
• Ye Backtracking problem hai.

Queen Attacks

• Same Row
• Same Column
• Same Diagonal

Approach

1. Row 0 se start karo.
2. Har column try karo.
3. Safe ho to Queen place karo.
4. Next row ke liye recursive call karo.
5. Agar solution na mile to Queen hata do (Backtracking).

Safety Check

• Sirf Upper side check hoti hai.
• Kyuki Queens Top → Bottom place hoti hain.

Check:

• ↑ Up
• ↖ Upper Left
• ↗ Upper Right

Base Case

row == board.length

• Sabhi Queens place ho gayi.
• Board print karo.

Time Complexity

• O(N!)

Space Complexity

• O(N) → Recursion Stack
• O(N²) → Board

Advantages

• Classic Backtracking problem.
• Recursion aur Backtracking samajhne ke liye best.
• Popular interview problem.

Disadvantages

• Large search space.
• Large N ke liye slow.

Applications

• Chess Problems
• Scheduling
• Constraint Satisfaction
• Puzzle Solving

*/