package binarySearch;
import java.util.Scanner;
public class targetFinding {

    static int binarySearch(int arr [] , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("invalid size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("enter sorted array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target element");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("target found at index: " + result);
        }
        else {
            System.out.println("target not found in the array");
        }
    }
}


/*
binary search work on sorted array .
code only for sorted array and ascending order array .
code will not work for unsorted array and descending order array .

int mid = (start + end) / 2;   // this can cause integer overflow if start and end are large
int mid = start + (end - start) / 2;   // this is a safer way to calculate mid to avoid integer overflow
*/