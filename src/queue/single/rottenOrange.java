package queue.single;

import java.util.LinkedList;
import java.util.Queue;

public class rottenOrange {

    static class Pair {

        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int orangesRotting(int[][] grid) {

        Queue<Pair> queue = new LinkedList<>();

        int freshOrange = 0;
        int time = 0;

        // Add all rotten oranges into Queue
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                }

                if (grid[i][j] == 1) {
                    freshOrange++;
                }
            }
        }

        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            time = current.time;

            for (int i = 0; i < 4; i++) {

                int newRow = current.row + row[i];
                int newCol = current.col + col[i];

                if (newRow >= 0 &&
                        newRow < grid.length &&
                        newCol >= 0 &&
                        newCol < grid[0].length &&
                        grid[newRow][newCol] == 1) {

                    grid[newRow][newCol] = 2;
                    freshOrange--;

                    queue.offer(new Pair(newRow, newCol, time + 1));
                }
            }
        }

        return (freshOrange == 0) ? time : -1;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println("Minimum Time : " + orangesRotting(grid));
    }
}

/*

Rotten Oranges (Queue + BFS)

Definition

• Har Minute Rotten Orange apne 4 Adjacent Fresh Oranges ko Rotten bana deta hai.
• Minimum Time nikalna hota hai jisme sabhi Fresh Oranges Rotten ho jaye.
• Multi-Source BFS ka use hota hai.

LeetCode

• 994 - Rotten Oranges

Concept Used

• Queue
• BFS (Breadth First Search)
• Multi-Source BFS
• Matrix Traversal

Data Members

• Pair → row, col, time
• Queue<Pair> → BFS Traversal
• freshOrange → Fresh Orange Count
• row[] / col[] → 4 Directions

Main Logic

• Sabhi Rotten Oranges ko Queue me add karo.
• Fresh Oranges Count karo.
• Queue se ek-ek Orange nikalo.
• Uske 4 Adjacent Cells check karo.
• Fresh Orange mile to Rotten banao aur Queue me add karo.
• Queue Empty hone tak Process Repeat karo.
• Agar Fresh Orange bach jaye to -1 Return karo, warna Time Return karo.

Directions

• Up    → (-1, 0)
• Down  → (1, 0)
• Left  → (0, -1)
• Right → (0, 1)

Time Complexity

• O(Row × Column)

Space Complexity

• O(Row × Column)

Advantages

• Efficient BFS Solution
• Har Cell sirf ek baar Visit hoti hai.
• Multiple Starting Points ko Easily Handle karta hai.

Disadvantages

• Extra Queue ki Need hoti hai.
• Matrix Modify hoti hai.

Applications

• Virus Spread
• Infection Simulation
• Fire Spread
• Flood Fill
• Network Broadcast
• BFS on Matrix

*/