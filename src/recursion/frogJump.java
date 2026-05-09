package recursion;
import java.util.Scanner;
public class frogJump {
    static int frogJump(int[] arr, int index) {
        if (index == arr.length - 1) {                              //base case: agar frog last stone par pahunch gaya to energy 0 lagegi
            return 0;
        }

        int option1Jump = Math.abs(arr[index] - arr[index + 1])    //self work: 1 step jump ki energy calculate karo
                          + frogJump(arr, index + 1);        //recursive call: baaki minimum energy recursion se nikalo

        if (index == arr.length - 2) {                             // agar second last stone par hai to sirf 1 jump possible hai
            return option1Jump;
        }

        int option2Jump = Math.abs(arr[index] - arr[index + 2])    //self work: 2 step jump ki energy calculate karo
                          + frogJump(arr, index + 2);        // recursive call: baaki minimum energy recursion se nikalo

        return Math.min(option1Jump, option2Jump);                 // dono jumps me minimum energy return karo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input lene ke liye Scanner object

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = frogJump(arr, 0);
        System.out.println("Minimum energy required: " + ans);
    }
}