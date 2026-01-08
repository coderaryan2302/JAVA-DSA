package arrays;
import java.util.Scanner;
public class secondlargestelement {


    //  Ye function array ka sabse bada (largest) element return karta hai
    static int firstlargest(int arr[]) {
        int max = Integer.MIN_VALUE;    // max ko sabse chhoti possible value se initialize kar rahe hain
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {    //agar current element max se bada hai
                max = arr[i];   // to max ko update kar do
            }
        }
        return max; //largest element return kar rahe hain
    }


    //  Ye function array ka second largest element print karta hai
    static void secondlargest(int arr[]) {
        int max = firstlargest(arr);    // pehle array ka largest element nikal rahe hain

        for (int i=0; i<arr.length; i++) {     //array ko dobara check kar rahe hain
            if (arr[i] == max) {     // agar element largest ke barabar hai
                arr[i] = Integer.MIN_VALUE;     // to us element ko bahut chhoti value se replace kar do....taaki next time largest nikalte waqt ye ignore ho jaye
            }
        }

        // phir se find kr rhe hai largest element ... ab jo largest milega wahi second largest hoga
        int secondlargest = firstlargest(arr);


        if (secondlargest == Integer.MIN_VALUE) {    // agar second largest exist nahi karta
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element is " + secondlargest);
        }
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
        secondlargest(arr);
    }
}


//*    Integer.MIN_VALUE = -infinity ... isko hum  maximum ke case mai use krte hai
//*    Integer.MAX_VALUE = +infinity ... isko hum  minimum ke case mai use krte hai