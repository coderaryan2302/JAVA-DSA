package arrays;
import java.util.Scanner;
public class peakElement {

    static void findPeak(int arr[]) {

        if (arr.length == 1){
            System.out.println("Peak element: " + arr[0]);
            System.out.println("Peak index: 0");
            return;
        }

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {

            // first element
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Peak element: " + arr[i]);
                    System.out.println("Peak index: " + i);
                    found = true;
                }
            }

            // last element
            else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println("Peak element: " + arr[i]);
                    System.out.println("Peak index: " + i);
                    found = true;
                }
            }

            // middle elements
            else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.println("Peak element: " + arr[i]);
                    System.out.println("Peak index: " + i);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No peak element found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("invalid array size: ");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findPeak(arr);
    }
}

/*
Peak Element: An element greater than its adjacent elements.
Example:
1 3 2 5 4
Peaks: 3, 5

Time Complexity: O(n)
Space Complexity: O(1)
*/