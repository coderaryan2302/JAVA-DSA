package arrays;
import java.util.Scanner;

public class noofelementsisgreaterthanx {
    static void elementsisgreater(int arr[],int x){
        int count=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("no of elements is greater than x " + count );
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter size of an element");
        int size =sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements");
        for (int i=0; i< arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("enter x");
        int x= sc.nextInt();

        elementsisgreater(arr,x);
    }
}
