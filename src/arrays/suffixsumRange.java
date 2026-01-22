package arrays;
import java.util.Scanner;
public class suffixsumRange {

        // ye function suffix sum banata hai
        public static int[] makingSuffixSum(int arr[]) {

            // last se start kyunki arr[last] already same rahega
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i] = arr[i] + arr[i + 1];
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

            int suffixsumArray[] = makingSuffixSum(arr);

            System.out.println("enter no of queries");
            int queries = sc.nextInt();

            while (queries > 0) {

                System.out.println("enter starting index");
                int l = sc.nextInt();

                System.out.println("enter ending index");
                int r = sc.nextInt();

                // agar index galat hai
                if (l < 0 || r < 0 || l >= arr.length || r >= arr.length || l > r) {
                    System.out.println("not valid range");
                } else {
                    int anssum;                                   // yahan final sum store hoga

                    if (r == arr.length - 1) {                    // agar r last index hai (array ke end tak)
                        anssum = suffixsumArray[l];               // l se last element tak ka sum direct mil jaata hai
                                                                  // kyunki suffix sum already peeche se bana hua hai
                    } else {
                        anssum = suffixsumArray[l]                // l se last tak ka total sum
                                - suffixsumArray[r + 1];          // r+1 se last tak ka extra sum minus kar diya
                                                                  // bacha hua sum = l se r tak ka sum
                    }

                    System.out.println("sum = " + anssum);
                }
                queries--;
            }
        }
    }
