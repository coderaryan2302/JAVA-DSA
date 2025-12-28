package conditionals;
import java.util.Scanner;
public class compare4nolargestone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        System.out.println("enter d");
        int d = sc.nextInt();


        if ((a > b) && (a > c) && (a > d)) {
            System.out.println("a is greatest");
        } else if ((b > a) && (b > c) && (b > d)) {
            System.out.println("b is greatest");
        } else if ((c > a) && (c > b) && (c > d)) {
            System.out.println("c is greatest");
        } else {
            System.out.println("d is greatest");
        }
    }
}



 // ye program se shortest bhi find kiya ja skta hai bass logic change ho jayega comparsion wale mai.. syntax same rahega

