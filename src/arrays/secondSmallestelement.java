package arrays;
import java.util.Scanner;

public class secondSmallestelement {

        // Ye function array ka sabse chhota (smallest) element return karta hai
        static int firstSmallest(int arr[]) {
            int min = Integer.MAX_VALUE;               // min ko sabse badi possible value se initialize kar rahe hain
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {                    // agar current element min se chhota hai
                    min = arr[i];                      // to min ko update kar do
                }
            }
            return min;                                // smallest element return kar rahe hain
        }

        // Ye function array ka second smallest element print karta hai
        static int secondSmallest(int arr[]) {
            int min = firstSmallest(arr);              // pehle array ka smallest element nikal rahe hain

            for (int i = 0; i < arr.length; i++) {     // array ko dobara check kar rahe hain
                if (arr[i] == min) {                   // agar element smallest ke barabar hai
                    arr[i] = Integer.MAX_VALUE;        // to us element ko bahut badi value se replace kar do
                }
            }

            // phir se find kar rahe hain smallest element
            // ab jo smallest milega wahi second smallest hoga
            int secondsmallest = firstSmallest(arr);
            return secondsmallest;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size of array");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("second smallest element " + secondSmallest(arr));
        }
    }

































