package binarySearch;

import java.util.Scanner;

public class childRaceTrackProblem {

    // Largest minimum distance return karega
    static int findAnswer(int[] arr, int kids) {

        if (kids > arr.length) {
            return -1;
        }

        int start = 1;
        int end = arr[arr.length - 1] - arr[0];
        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int count = 1;
            int lastPosition = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] - lastPosition >= mid) {
                    count++;
                    lastPosition = arr[i];
                }
            }

            if (count >= kids) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of spots: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter spot positions in sorted order:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of kids: ");
        int kids = sc.nextInt();

        if (kids <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int answer = findAnswer(arr, kids);

        if (answer == -1) {
            System.out.println("Not enough spots for all kids");
        } else {
            System.out.println("Largest Minimum Distance = " + answer);
        }
    }
}

/*
Child Race Track Problem

Definition
• Sorted positions me itne kids place karne hote hain ki kisi bhi do kids ke beech ki minimum distance maximum ho.

Working
• Binary Search se answer (distance) search karo.
• Har mid distance ke liye check karo ki sabhi kids place ho sakte hain ya nahi.
• Agar possible ho to aur badi distance try karo.
• Warna chhoti distance try karo.
• Last possible distance hi answer hoti hai.

Key Points
• Array sorted hona chahiye.
• Binary Search answer par lagti hai, array par nahi.
• Greedy approach se placement check hota hai.
• Largest possible minimum distance return hoti hai.

Edge Cases
• Invalid input (size <= 0)
• Invalid number of kids
• Kids > Number of spots
• Only one kid
• Duplicate positions

Time Complexity : O(n log(maxDistance))
Space Complexity : O(1)

Revision
• Search Space = 1 to (Last Position - First Position)
• Check current distance
• Possible → Search Right
• Not Possible → Search Left
• Return largest minimum distance
*/