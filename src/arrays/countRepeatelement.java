package arrays;
import java.util.Scanner;
public class countRepeatelement {
    static void countTherepeatedElement(int arr[],int x) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("count of x element " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("enter the elements ");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter x");
        int x =sc.nextInt();

        countTherepeatedElement(arr,x);
    }
}
