package arrays;
import java.util.Scanner;
public class checkArrayisSorted {
   static void arrayIssorted(int arr[]){
        boolean check=true;
        for (int i=1; i< arr.length;i++) {     // i=0 isliye nhi liye kyuki arr[0]=arr[-1] ye koi condition nhi hai kyu ki arr[-1] hai hee nhi....
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        System.out.println(check);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter array element");
        for (int i=0; i< arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.print("array is sorted = ");
        arrayIssorted(arr);
    }
}


// 4no line mai void ke jagah boolean bhi laga skte hai.. or uska return statement 12no pe laga skte hai sout ke jagah pe hata ke
// or 26no line pe function call jo hua hai wo sout ke andar ho jayega ...