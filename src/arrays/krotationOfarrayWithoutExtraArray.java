package arrays;

import java.util.Scanner;

public class krotationOfarrayWithoutExtraArray {

    // array ke kisi part ko ulta karta hai
    static void reverse(int arr[], int start, int end) {     // reverse function
        while (start < end) {                                // jab tak start < end
            int temp = arr[start];                           // start value save
            arr[start] = arr[end];                           // end value start me
            arr[end] = temp;                                 // saved value end me
            start++;                                         // start aage
            end--;                                           // end peeche
        }
    }

    // array ko right side me k times rotate karta hai
    static void rotateRight(int arr[], int k) {              // rotation function

        int n = arr.length;                                  // array ka size
        k = k % n;                                           // extra rotation remove

        reverse(arr, 0, n - k - 1);                // pehla hissa ulta
        reverse(arr, n - k, n - 1);                // last hissa ulta
        reverse(arr, 0, n - 1);                    // poora array ulta
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter value of k");
        int k = sc.nextInt();

        rotateRight(arr, k);
        System.out.println("array after rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
