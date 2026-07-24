package backTracking;

public class sudoku {

    // Solve Sudoku
    static boolean solveSudoku(int[][] board) {

        // Find Empty Cell
        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) {

                    for (int num = 1; num <= 9; num++) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;           // Place number

                            if (solveSudoku(board))
                                return true;

                            board[row][col] = 0;             // Backtracking
                        }
                    }

                    return false;
                }
            }
        }

        return true;                                         // Sudoku solved
    }

    // Safe position check
    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Row
        for (int i = 0; i < 9; i++)
            if (board[row][i] == num) return false;

        // Column
        for (int i = 0; i < 9; i++)
            if (board[i][col] == num) return false;

        // 3 × 3 Box
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board[i][j] == num) return false;

        return true;
    }

    // Display Sudoku
    static void display(int[][] board) {

        for (int[] row : board) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] board = {
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        if (solveSudoku(board)) {

            System.out.println("Solved Sudoku\n");
            display(board);

        } else {
            System.out.println("No Solution Exists");
        }
    }
}

/*

Sudoku Solver

Definition

• 9 × 9 Sudoku board ke sabhi empty cells fill karne hote hain.
• Har placement Sudoku rules follow kare.
• Ye Backtracking problem hai.

Board

• Size = 9 × 9
• Empty Cell = 0

Sudoku Rules

• Har Row me 1–9 ek hi baar aayega.
• Har Column me 1–9 ek hi baar aayega.
• Har 3 × 3 Box me 1–9 ek hi baar aayega.

Approach

1. Empty cell find karo.
2. 1 se 9 tak number try karo.
3. Safe ho to place karo.
4. Recursive call karo.
5. Fail ho to 0 restore karo (Backtracking).

isSafe()

Check:

• Same Row
• Same Column
• Same 3 × 3 Box

3 × 3 Box Formula

Start Row = row - (row % 3)

Start Col = col - (col % 3)

Base Case

• Agar koi empty cell na mile to Sudoku solve ho chuka hai.
• Return true.

Backtracking

• Number place karo.
• Recursive call karo.
• Fail hone par cell ko 0 restore karo.

Time Complexity

• O(9^N)

N = Empty Cells

Space Complexity

• O(N)

Advantages

• Har valid Sudoku solve kar sakta hai.
• Classic Backtracking problem.
• Interview me bahut common.

Disadvantages

• Empty cells zyada hone par slow.
• Large search space.

Applications

• Sudoku Games
• Puzzle Solving
• Constraint Satisfaction
• Artificial Intelligence
• Backtracking Practice

*/