package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class shallowanddeepcopy {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void deepCopy(int arr[]) {
        int arr2[] = Arrays.copyOf(arr, arr.length);    // new array ban gaya
        arr2[0] = 100;                                  // sirf arr2 change

        System.out.print("Deep Copy Array : ");
        print(arr2);

        System.out.print("Original Array  : ");
        print(arr);
    }

    static void shallowCopy(int arr[]) {
        int arr2[] = arr;                              // same array ka address
        arr2[0] = 200;                               // dono change

        System.out.print("Shallow Copy Array : ");
        print(arr2);

        System.out.print("Original Array    : ");
        print(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array : ");
        print(arr);

        System.out.println("Deep copy array : ");
        deepCopy(arr);

        System.out.println("Shallow copy array : ");
        shallowCopy(arr);
    }
}





/*

 ARRAY MEMORY CONCEPT
- Java me array HEAP memory me banta hai
- Array variable sirf us array ka REFERENCE (address) store karta hai


 SHALLOW COPY (Reference Copy)..
- Sirf array ka ADDRESS copy hota hai
- Koi naya array create nahi hota
- Dono variables SAME memory location ko point karte hain
- Ek array me change karne par ORIGINAL array bhi change ho jaata hai
- Fast hota hai (no extra memory)
- Risky hota hai (data unsafe)

Example:
int arr2[] = arr;

Result:
arr == arr2   → true
arr[0] change → arr2[0] bhi change

Use when:
- Performance important ho
- Original data change hone se problem na ho


 DEEP COPY (Data Copy)..
- Naya array create hota hai
- Data original array se COPY hota hai
- Dono arrays ki memory location DIFFERENT hoti hai
- Ek array me change karne par dusra affect nahi hota
- Safe hota hai (data protected)
- Thoda slow hota hai (extra memory use)

Result:
arr == arr2   → false
arr2 change  → arr original same rehta hai

Use when:
- Data safety important ho
- Original array ko protect karna ho


 DEEP COPY BANANE KE METHODS
1️⃣ Arrays.copyOf()
int arr2[] = Arrays.copyOf(arr, arr.length);

 * lekin sirf first 2 elements copy ho rahe hain
 * int[] arr2 = Arrays.copyOf(arr, 2);

2️⃣ clone()
int arr2[] = arr.clone();
yeh bhi DEEP COPY hai

*/
