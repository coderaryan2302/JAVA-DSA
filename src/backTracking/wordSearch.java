package backTracking;

public class wordSearch {

    static boolean exist(char[][] board, String word) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {

                if (search(board, word, row, col, 0))
                    return true;
            }
        }

        return false;
    }

    static boolean search(char[][] board, String word,
                          int row, int col, int index) {

        if (index == word.length()) return true; // Word found

        if (row < 0 || col < 0 ||
                row >= board.length || col >= board[0].length)
            return false; // Out of boundary

        if (board[row][col] != word.charAt(index))
            return false; // Character mismatch

        board[row][col] = '*'; // Mark visited

        boolean answer =
                search(board, word, row - 1, col, index + 1) || // Up
                        search(board, word, row + 1, col, index + 1) || // Down
                        search(board, word, row, col - 1, index + 1) || // Left
                        search(board, word, row, col + 1, index + 1);   // Right

        board[row][col] = word.charAt(index); // Backtracking

        return answer;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        System.out.println(exist(board, word));
    }
}

/*

Word Search (LeetCode 79)

Definition

• 2D board me diya hua word exist karta hai ya nahi check karna hota hai.
• Ek cell ko ek path me sirf ek baar use kar sakte hain.
• Ye DFS + Backtracking problem hai.

Moves

• Up
• Down
• Left
• Right

Approach

1. Har cell se search start karo.
2. Character match ho to visited mark karo.
3. 4 directions me search karo.
4. Return hote waqt cell restore karo (Backtracking).

Base Cases

• index == word.length() → Word mil gaya.
• Out of Boundary → Return false.
• Character match na ho → Return false.

Backtracking

• Cell ko '*' mark karo.
• 4 directions explore karo.
• Cell ko original character se restore karo.

Visited Cell

• Same cell ko dobara use hone se rokta hai.
• Extra visited array ki zarurat nahi.

Time Complexity

• O(R × C × 4^L)

R = Rows

C = Columns

L = Word Length

Space Complexity

• O(L)

Advantages

• Efficient DFS + Backtracking solution.
• Extra visited array nahi lagta.
• Interview me bahut common.

Disadvantages

• Long words ke liye recursive calls badh jati hain.
• Worst case me slow.

Applications

• Matrix Searching
• Puzzle Solving
• DFS Problems
• Backtracking

*/