package backTracking;

public class chessHorsePath {

    static int n = 5;
    static int[][] board = new int[n][n];

    // Knight ke 8 possible moves
    static int[] rowMove = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int[] colMove = {1, -1, 2, 2, 1, -1, -2, -2};

    // Knight Tour
    static boolean knightTour(int row, int col, int move) {

        if (move == n * n) return true;      // Sabhi cells visit ho gayi

        for (int i = 0; i < 8; i++) {

            int newRow = row + rowMove[i];
            int newCol = col + colMove[i];

            if (isSafe(newRow, newCol)) {

                board[newRow][newCol] = move;      // Mark visit

                if (knightTour(newRow, newCol, move + 1))
                    return true;

                board[newRow][newCol] = -1;        // Backtracking
            }
        }
        return false;
    }

    // Safe position check
    static boolean isSafe(int row, int col) {

        return row >= 0 && row < n &&
                col >= 0 && col < n &&
                board[row][col] == -1;
    }

    // Display board
    static void display() {

        for (int[] row : board) {
            for (int value : row)
                System.out.printf("%2d ", value);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Board initialize
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = -1;

        board[0][0] = 0;      // Start position

        if (knightTour(0, 0, 1)) {
            System.out.println("Knight Tour Found\n");
            display();
        } else {
            System.out.println("No Solution Exists");
        }
    }
}

/*

Knight's Tour

Definition

• Knight ko Chess Board ki har cell exactly 1 baar visit karni hoti hai.
• Knight sirf apne 8 valid chess moves use karta hai.
• Ye Backtracking problem hai.

Knight Moves

(-2,+1) (-2,-1)
(-1,+2) (+1,+2)
(+2,+1) (+2,-1)
(+1,-2) (-1,-2)

Approach

1. Start cell se begin karo.
2. Current cell ko visited mark karo.
3. 8 moves try karo.
4. Safe move ho to recursive call karo.
5. Agar path fail ho to cell ko unmark karke next move try karo.

Base Case

move == n * n

• Sabhi cells visit ho gayi.
• Return true.

isSafe()

• Position board ke andar ho.
• Cell pehle visit na hui ho (-1).

Time Complexity

• O(8^(N × N))

Space Complexity

• O(N × N) → Board + Recursion Stack

Advantages

• Backtracking aur recursion samajhne ke liye best.
• Chess based famous problem.

Disadvantages

• Search space bahut large hota hai.
• Large boards ke liye slow.

Applications

• Chess AI
• Path Finding
• Robotics
• Puzzle Solving
• Artificial Intelligence

*/