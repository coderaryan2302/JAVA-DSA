package arrays;

import java.util.Arrays; // Arrays.copyOf() method use karne ke liye
import java.util.Scanner;

public class copythearray {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//
//         * original array ko print kar rahe hain
//         * taaki pata chale starting me array me kya hai

        System.out.println("orginal array");
        printarray(arr);

        // ================= ARRAY COPY PART =================

        /*
         * -------- SHALLOW COPY --------
         *
         * int[] arr2 = arr;
         *
         * yahan kya hota:
         * - koi naya array nahi banta
         * - arr2 ko arr ka address mil jata hai
         * - dono SAME memory ko point karte hain
         *
         * agar arr2 change hua
         * to arr bhi change ho jayega
         *
         * isliye isko SHALLOW COPY kehte hain
         * (unsafe)
         */

        /*
         * -------- DEEP COPY (METHOD 1) --------
         *
         * int[] arr2 = arr.clone();
         *
         * clone() kya karta hai:
         * - ek naya array banata hai
         * - arr ke saare elements copy karta hai
         * - arr aur arr2 alag-alag memory me hote hain
         */

        /*
         * -------- DEEP COPY (METHOD 2) --------
         *
         * int[] arr2 = Arrays.copyOf(arr, arr.length);
         *
         * yeh bhi naya array banata hai
         * pura array copy hota hai
         */

        /*
         * -------- TUMHARA ACTUAL CODE --------
         *
         * yeh bhi DEEP COPY hai
         * lekin sirf first 2 elements copy ho rahe hain
         */
        int[] arr2 = Arrays.copyOf(arr, 2);

//
//         * arr2 ka apna alag memory hai
//         * arr se koi relation nahi hai ab

        System.out.println("copied array2");
        printarray(arr2);

//
//         * ab hum arr2 ke elements change kar rahe hain
//         * sirf arr2 change hoga
//         * arr par koi effect nahi padega
//
        arr2[0] = 21;
        arr2[1] = 26;
        System.out.println("changement in array2");
        printarray(arr2);

//
//         * original array dobara print kar rahe hain
//         * agar deep copy sahi hai
//         * to arr bilkul same rehna chahiye
//
        System.out.println("original array again");
        printarray(arr);


    }
}
