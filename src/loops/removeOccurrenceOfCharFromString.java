package loops;
import java.util.Scanner;
public class removeOccurrenceOfCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word:");
        String s = sc.nextLine();

        System.out.println("Enter character to remove:");
        char ch1 = sc.next().charAt(0);

        String ans = "";                       // final answer store karne ke liye empty string banayi
        for(int i = 0; i < s.length(); i++){   // string ke har character par loop chalao
            if(s.charAt(i) != ch1){            // check karo ki current character remove wala nahi hai
                ans = ans + s.charAt(i);       // character ko answer me add karo
            }
        }

        System.out.println("After removing character: " + ans);
    }
}