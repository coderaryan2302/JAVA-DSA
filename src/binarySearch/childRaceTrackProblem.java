package binarySearch;
import java.util.Scanner;
public class childRaceTrackProblem {

    static int findAnswer(int arr[], int kids) {
        if (kids > arr.length) {
            return -1;
        }

        int start = 1;
        int end = arr[arr.length - 1] - arr[0];
        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 1;
            int last = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - last >= mid) {
                    count++;
                    last = arr[i];
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

        System.out.print("Enter no. of spots (array size): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter spot positions in sorted way :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of kids: ");
        int kids = sc.nextInt();

        if (kids <= 0) {
            System.out.println("Invalid number of kids");
            return;
        }

        int ans = findAnswer(arr, kids);
        if (ans == -1) {
            System.out.println("Not enough spots for all kids");
        } else {
            System.out.println("Largest Minimum Distance = " + ans);
        }
    }
}


/*
Pattern:
Answer Search Binary Search

Logic:
If Current Distance Possible,
Try Bigger Distance.

If Not Possible,
Try Smaller Distance.

Array Must Be Sorted.

Complexity:
Time -> O(n log(maxDistance))
Space -> O(1)
*/