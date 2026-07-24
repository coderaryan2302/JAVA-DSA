package backTracking;

public class ratInAMazePath2 {

    // Print All Paths
    static void maze(int row, int col,
                     int endRow, int endCol,
                     String path,
                     boolean[][] visited) {

        if (row < 0 || col < 0 || row > endRow || col > endCol) return; // Out of boundary
        if (visited[row][col]) return;                                   // Already visited

        if (row == endRow && col == endCol) {                            // Destination
            System.out.println(path);
            return;
        }

        visited[row][col] = true;                                        // Mark visited

        maze(row, col + 1, endRow, endCol, path + "R ", visited); // Right
        maze(row + 1, col, endRow, endCol, path + "D ", visited); // Down
        maze(row, col - 1, endRow, endCol, path + "L ", visited); // Left
        maze(row - 1, col, endRow, endCol, path + "U ", visited); // Up

        visited[row][col] = false;                                       // Backtracking
    }

    public static void main(String[] args) {

        int rows = 3, cols = 3;

        boolean[][] visited = new boolean[rows][cols];

        System.out.println("All Possible Paths\n");

        maze(0, 0, rows - 1, cols - 1, "", visited);
    }
}

/*

Rat in a Maze

Definition

• Rat ko Start se Destination tak pahunchna hota hai.
• 4 directions me move kar sakta hai.
• Ye Backtracking problem hai.

Moves

• Right (R)
• Down (D)
• Left (L)
• Up (U)

Approach

1. Current cell check karo.
2. Destination ho to path print karo.
3. Cell ko visited mark karo.
4. 4 directions me recursive call karo.
5. Cell ko unmark karo (Backtracking).

Base Cases

• Out of Boundary → Return
• Already Visited → Return
• Destination → Path print karo.

Backtracking

• Cell ko visited mark karo.
• Sabhi directions explore karo.
• Return hote waqt unmark karo.

Visited Array

• Same cell dobara visit hone se bachata hai.
• Infinite loop ko prevent karta hai.

Time Complexity

• O(4^(R × C))

Space Complexity

• O(R × C)

Advantages

• Sabhi possible paths find karta hai.
• Backtracking ka best example.
• Infinite loop avoid karta hai.

Disadvantages

• Large search space.
• Large maze ke liye slow.
• Visited array ki extra memory lagti hai.

Applications

• Path Finding
• Maze Solving
• Robotics
• AI Navigation
• Graph Traversal

*/