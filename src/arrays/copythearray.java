package arrays;
import java.util.Arrays; //38no line ke liye import file hai
import java.util.Scanner;
class copy1starrayinto2ndarray {
    static void printarray(int[] arr) {  // static keyword lga hai bina obj bna ke direct call ho jayega
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(); //nextline ke line use kiye h
    }
}
    public class copythearray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // taking size of an array
            System.out.println("enter size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];

            // taking input element from user
            System.out.println("enter elements ");
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("orginal array");
            copy1starrayinto2ndarray.printarray(arr);     // methods lga ke print krwane ka tarika

//  without methods lga ke print krwane ka tarika
//        for (int i = 0; i <n; i++) {
//            System.out.println(arr[i]);
//        }

//  trying to copy arr to arr2
         //   int[] arr2 = arr; // shallow copy hua jisme purana array 1 ko copy kiya gya hai .. ye bhi rasta hai copy krne k
         //   int[] arr2 = arr.clone();// arr.clone() ye ek inbuilt methods h jo deep copy kiya hai
         //   int[] arr2 = Arrays.copyOf(arr, arr.length); // deep copy kiya gya hai .... Arrays.copyOf(arr,arr.length) ye bhi inbuilt methods h array import java file mai jo copy krta hai .. isme 1st parameter hai jo array se copy krna hai wo dey do or .. 2nd parameter hai arr.length
            int[] arr2 =Arrays.copyOf(arr, 2); //isme 2 tk hee copy krega
            System.out.println("copied array2");
            copy1starrayinto2ndarray.printarray(arr2);


//            changes the value in arr2 by manually
            arr2[0]=21;
            arr2[1]=26;
            System.out.println("changement in array2");
            copy1starrayinto2ndarray.printarray(arr2); // methods lga ke copy krwa ke print krwana


//  without methods lga ke copy krwa ke print krwana
//        for (int i=0; i<n; i++) {
//            System.out.println(arr2[i]);
//        }
        }
    }

