package arrays;
import java.util.Scanner;
public class arraymanipulation {

    // Ye function array ke unique elements print karta hai ...unique element jo sirf 1 baar aata ho
    static void uniqueelements(int[] arr) {
        boolean found = false; // ye check karne ke liye ki koi unique element mila ya nahi

        System.out.println("Unique elements are:");

        for (int i = 0; i < arr.length; i++) {  // outer loop: ek-ek element ko pick kar rahe hain
            int count = 0;  // count batayega element kitni baar aaya
            for (int j = 0; j < arr.length; j++) {  // inner loop: poore array mein compare kar rahe hain
                if (arr[i] == arr[j]) {  // agar dono elements same hain
                    count++;
                }
            }
            if (count == 1) {  // agar count 1 hai, matlab element sirf ek baar aaya hai
                System.out.print(arr[i] + " ");  // unique element print karo
                found = true;  //  batane ke liye ki kam se kam ek unique element mila
            }
        }

        if (!found) {  // agar ek bhi unique element nahi mila
            System.out.println("No unique elements");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        uniqueelements(arr);
    }
}