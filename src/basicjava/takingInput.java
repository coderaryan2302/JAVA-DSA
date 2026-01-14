package basicjava;
import java.util.Scanner;                            //input lene ke liye scanner class ko lena  parta hai java .util se

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // scanner bna ke input lete hai user se
        System.out.println("enter ur name ");
        String name = sc.nextLine();                // jab character type input lete tb ye use krte h or nextLine() isliye likhe hai taki pura sentence ko wo consider kre isme space consider bhi hota hai  .. agr sirf next() likh dete too space ke bdd wla nhi leta
        System.out.println("name is" + name);      // isme name jo likha hai usme input ko store kiye hai user se le ke


        System.out.println("enter a no.");
        int num1 = sc.nextInt();                   // or jab integer type input lete hai us tym ye int lete hai
        System.out.println("lucky no is" + num1);  //isme num1 jo likha hai usme input ko store kiye hai user se le ke


        //another example
        System.out.println("enter a 1st no.");
        int number1 = sc.nextInt();
        System.out.println("enter a 2nd no.");
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println("sum is" + sum);
    }
}








