package backTracking;

public class ratInAMazePath3 {

    // Print All Paths
    static void maze(int row, int col,
                     int endRow, int endCol,
                     int[][] maze,
                     String path) {

        if (row < 0 || col < 0 || row > endRow || col > endCol) return; // Out of boundary
        if (maze[row][col] == 0) return;                                 // Blocked cell
        if (maze[row][col] == -1) return;                                // Already visited

        if (row == endRow && col == endCol) {                            // Destination
            System.out.println(path);
            return;
        }

        maze[row][col] = -1;                                             // Mark visited

        maze(row, col + 1, endRow, endCol, maze, path + "R "); // Right
        maze(row + 1, col, endRow, endCol, maze, path + "D "); // Down
        maze(row, col - 1, endRow, endCol, maze, path + "L "); // Left
        maze(row - 1, col, endRow, endCol, maze, path + "U "); // Up

        maze[row][col] = 1;                                              // Backtracking
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}
        };

        int rows = maze.length;
        int cols = maze[0].length;

        System.out.println("All Possible Paths\n");

        maze(0, 0, rows - 1, cols - 1, maze, "");
    }
}

/*

Rat in a Maze (With Obstacles)

Definition

• Rat ko Start se Destination tak pahunchna hota hai.
• Maze me obstacles bhi hote hain.
• Ye Backtracking problem hai.

Maze Representation

• 1 → Open Path
• 0 → Blocked Cell
• -1 → Visited Cell (Temporary)

Moves

• Right (R)
• Down (D)
• Left (L)
• Up (U)

Approach

1. Boundary check karo.
2. Blocked ya visited ho to return karo.
3. Destination ho to path print karo.
4. Current cell ko -1 mark karo.
5. 4 directions me recursive call karo.
6. Cell ko wapas 1 bana do (Backtracking).

Base Cases

• Out of Boundary → Return
• Blocked Cell → Return
• Already Visited → Return
• Destination → Path print karo.

Backtracking

• Cell ko -1 mark karo.
• Sabhi directions explore karo.
• Return hote hi cell ko 1 restore karo.

Why -1?

• Same cell dobara visit nahi hoti.
• Infinite loop avoid hota hai.
• Backtracking ke baad cell fir se use ho sakti hai.

Time Complexity

• O(4^(R × C))

Space Complexity

• O(R × C)

Advantages

• Obstacles handle karta hai.
• Extra visited array ki zarurat nahi.
• Standard interview problem.

Disadvantages

• Exponential time.
• Large maze ke liye slow.

Applications

• Maze Solving
• Path Finding
• Robotics
• AI Navigation
• Graph Traversal

*/