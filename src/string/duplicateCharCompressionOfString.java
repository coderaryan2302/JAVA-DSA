package string;
import java.util.*;
public class duplicateCharCompressionOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        if(str.length() == 0){
            System.out.println("");             // Empty String
            sc.close();
            return;
        }

        StringBuilder ans = new StringBuilder(); // Store Final Answer
        ans.append(str.charAt(0));               // Add First Character
        int count = 1;                           // Count Frequency
        for(int i = 1; i < str.length(); i++){
            char current = str.charAt(i);        // Current Char
            char previous = str.charAt(i - 1);   // Previous Char
            if(current == previous){
                count++;                         // Same Character Found
            }
            else{
                if(count > 1){
                    ans.append(count);          // Add Frequency
                }
                count = 1;                      // Reset Count
                ans.append(current);            // Add New Character
            }
        }
        if(count > 1){
            ans.append(count);                 // Last Character Frequency
        }
        System.out.println("final ans: " + ans);               // Compressed String Output
    }
}

/*
Input  : aaabbccccdd
Output : a3b2c4d2

Logic:
1. First character answer me add karo.
2. Consecutive duplicate characters count karo.
3. Character change hote hi frequency add karo.
4. Naya character answer me add karo.
5. Last character ki frequency separately handle karo.

Example:
aaabbccccdd
a -> 3 times -> a3
b -> 2 times -> b2
c -> 4 times -> c4
d -> 2 times -> d2

Final Answer:
a3b2c4d2

Time Complexity  : O(n)
Space Complexity : O(n)
*/