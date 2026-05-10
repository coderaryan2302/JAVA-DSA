package string;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("enter any words");
        String s = sc.nextLine();                   // nextLine pura line mai jitne words h sab ko ley ga
        System.out.println("output = "+ s);

        // single character         (char indexing is 0 based)
        char ch = s.charAt(0);
        char ch1 = s.charAt(1);
        System.out.println("0th index character = " + ch);
        System.out.println("1st index character = " + ch1);

        // substring method for print character from index from _ to _
        System.out.println("printing character from substring method = " + s.substring( 2,4)); // 2 is inclusive index and 4 is exclusive

        // printing all character
        for (int i = 0; i < s.length() ; i++) {        // s.length for size of string
            System.out.print(s.charAt(i) + " ");       // s.charAt(i) is way for each index printing
        }
    }
}
