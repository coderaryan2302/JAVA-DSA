package backTracking;

public class chessHorsePath2 {

    static int n = 4;

    // Place N Knights
    static void placeKnights(boolean[][] board, int row, int col, int knights) {

        if (knights == 0) {          // Sabhi Knights place ho gaye
            display(board);
            System.out.println();
            return;
        }

        if (row == n) return;        // Board khatam

        if (col == n) {              // Next row
            placeKnights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {

            board[row][col] = true;                      // Place Knight
            placeKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;                     // Backtracking
        }

        placeKnights(board, row, col + 1, knights);      // Current cell skip
    }

    // Safe position check
    static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(row - 2, col - 1) && board[row - 2][col - 1]) return false;
        if (isValid(row - 2, col + 1) && board[row - 2][col + 1]) return false;
        if (isValid(row - 1, col - 2) && board[row - 1][col - 2]) return false;
        if (isValid(row - 1, col + 2) && board[row - 1][col + 2]) return false;

        return true;
    }

    // Board boundary check
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
        placeKnights(board, 0, 0, n);
    }
}

/*

N Knights

Definition

• N × N Chess Board par N Knights place karni hoti hain.
• Koi bhi 2 Knights ek dusre ko attack nahi karni chahiye.
• Ye Backtracking problem hai.

Knight Moves

(-2,+1) (-2,-1)
(-1,+2) (+1,+2)
(+2,+1) (+2,-1)
(+1,-2) (-1,-2)

Approach

1. First cell se start karo.
2. Safe ho to Knight place karo.
3. Next cell ke liye recursive call karo.
4. Agar solution na mile to Knight hata do (Backtracking).
5. Current cell skip karke next position try karo.

Safety Check

• Sirf upper positions check hoti hain.
• Board Top → Bottom aur Left → Right fill hota hai.
• Neeche wali cells abhi empty hoti hain.

Base Case

knights == 0

• Sabhi Knights place ho gayi.
• Board print karo.

Time Complexity

• O(2^(N × N))

Space Complexity

• O(N × N) → Board + Recursion Stack

Advantages

• Simple Backtracking problem.
• Recursive thinking improve hoti hai.
• Easy to understand.

Disadvantages

• Exponential time.
• Large board ke liye slow.

Applications

• Chess Problems
• Puzzle Solving
• Constraint Satisfaction

*/