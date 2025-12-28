package basicjava;
import java.util.Scanner;
public class readchar { // ye concept se hum sab char. sort list krte hai ek pure string mai se
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character ");
                char ch = sc.nextLine().charAt(8); // basically string mai bhtt charcter hote hai isme wahi charcter sort out krenge
        System.out.println("character is " + ch);
    }
}
