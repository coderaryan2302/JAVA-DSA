package arrays;

import java.util.Scanner;

public class krotionOfarrray {

    // yeh function array ko right side me k times rotate karta hai
    // extra array ka use karke
    static void rotation(int arr[], int k, int ans[]) {

        int n = arr.length;          // original array ka size
        k = k % n;                   // agar k size se bada ho to adjust

        int j = 0;                   // answer array ka index

        // last k elements ko answer array ke start me daalo
        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];         // last elements copy
            j++;                     // answer index badhao
        }

        // bache hue elements ko answer array me daalo
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];         // remaining elements copy
            j++;                     // answer index badhao
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int ans[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k");
        int k = sc.nextInt();

        rotation(arr, k, ans);

        System.out.println("array after rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
