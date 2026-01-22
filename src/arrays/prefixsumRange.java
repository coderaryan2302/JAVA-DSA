package arrays;
import java.util.Scanner;
public class prefixsumRange {

    // ye function prefix sum banata hai
    public static int[] makingprefixSum(int arr[]) {

        // index 1 se start kyunki arr[0] already same rahega
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int prefixsumArray[] = makingprefixSum(arr);

        System.out.println("enter no of queries");
        int queries = sc.nextInt();

        while (queries > 0) {

            System.out.println("enter starting index");
            int l = sc.nextInt();

            System.out.println("enter ending index");
            int r = sc.nextInt();

            // agar index galat hai
            if (l < 0 || r < 0 || l >= arr.length || r >= arr.length || l>r ) {
                System.out.println("not valid range");
            } else {
                int anssum;                                   // yahan final range sum store hoga

                if (l == 0) {                                 // agar range 0 index se start ho rahi hai
                    anssum = prefixsumArray[r];               // 0 se r tak ka sum direct mil jaata hai
                                                              // kyunki prefix sum start se bana hota hai
                }
                else {
                    anssum = prefixsumArray[r]                // 0 se r tak ka total sum
                            - prefixsumArray[l - 1];          // 0 se l-1 tak ka extra sum minus
                                                              // bacha hua sum = l se r tak
                    }

                    System.out.println("sum = " + anssum);
            }
            queries--;
        }
    }
}
