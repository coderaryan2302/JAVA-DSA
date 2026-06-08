package string;
import java.util.*;
public class reverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        String ans = "";
        StringBuilder word = new StringBuilder();           // Current Word
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word.append(ch);                            // Build Word

            }else{
                ans += word.reverse();                      // Reverse Word
                ans += " ";                                 // Add Space
                word = new StringBuilder();                 // Reset Word
            }
        }
        ans += word.reverse();                              // Last Word
        System.out.println("final ans: " + ans);
    }
}

/*
Input:
I love Java

Output:
I evol avaJ

Logic:
Store Characters Of Current Word.
Space Mile To Word Reverse Karo.
Answer Me Add Karo.
Last Word Separately Handle Karo.

Example:
I love Java
I -> I
love -> evol
Java -> avaJ

Output:
I evol avaJ

Complexity:
Time -> O(n)
Space -> O(n)

Revision:
Word Build Karo.
Space Mile -> Reverse Karo.
Last Word Alag Se Handle Karo.
*/