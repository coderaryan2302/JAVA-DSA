package backTracking;

public class ratInAMazePath {

    // Method 1 : Count Total Paths
    static int countPaths(int startRow, int startCol, int endRow, int endCol) {

        if (startRow > endRow || startCol > endCol) return 0;          // Out of boundary
        if (startRow == endRow && startCol == endCol) return 1;        // Destination

        int down = countPaths(startRow + 1, startCol, endRow, endCol);
        int right = countPaths(startRow, startCol + 1, endRow, endCol);

        return down + right;
    }

    // Method 2 : Print All Paths
    static void printPaths(int startRow, int startCol,
                           int endRow, int endCol,
                           String path) {

        if (startRow > endRow || startCol > endCol) return;            // Out of boundary

        if (startRow == endRow && startCol == endCol) {                // Destination
            System.out.println(path);
            return;
        }

        printPaths(startRow + 1, startCol, endRow, endCol, path + "D ");
        printPaths(startRow, startCol + 1, endRow, endCol, path + "R ");
    }

    public static void main(String[] args) {

        int rows = 3, cols = 3;

        System.out.println("Total Paths = " + countPaths(1, 1, rows, cols));

        System.out.println("\nAll Possible Paths\n");

        printPaths(1, 1, rows, cols, "");
    }
}

/*

Maze Path

Definition

• Start cell se Destination tak sabhi possible paths find karte hain.
• Ye Recursion problem hai, Backtracking nahi.
• Sirf Right (R) aur Down (D) move allowed hain.

Moves

• Down (D)
• Right (R)

Example

3 × 3 Maze

Total Paths = 6

Methods

Method 1 : Count Paths
• Total possible paths return karta hai.

Method 2 : Print Paths
• Sabhi possible paths print karta hai.

Method 1

Approach

1. Down move karo.
2. Right move karo.
3. Dono answers add karke return karo.

Base Cases

• Out of Boundary → Return 0
• Destination → Return 1

Formula

Total Paths = Down + Right

Method 2

Approach

1. Path String maintain karo.
2. Down par "D" add karo.
3. Right par "R" add karo.
4. Destination par path print karo.

Base Cases

• Out of Boundary → Return
• Destination → Path print karo.

Time Complexity

• O(2^(R + C))

Space Complexity

• O(R + C)

Advantages

• Simple Recursion problem.
• Recursive thinking improve hoti hai.
• Beginners ke liye best.

Disadvantages

• Large maze ke liye slow.
• Recursive calls bahut badh jati hain.

Applications

• Path Finding
• Grid Problems
• Dynamic Programming
• Recursion Practice

*/