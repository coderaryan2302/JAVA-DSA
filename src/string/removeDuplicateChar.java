package string;
import java.util.*;
public class removeDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

        boolean[] visited = new boolean[256];           // Track Visited Characters

        StringBuilder ans = new StringBuilder();        // Store Answer

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);                    // Current Character
            if(!visited[ch]){
                ans.append(ch);                         // Add First Occurrence
                visited[ch] = true;                     // Mark As Visited
            }
        }
        System.out.println(ans);
    }
}

/*
Input:
aabbccdd

Output:
abcd

Logic:
Store Visited Characters.
Add Character Only First Time.

Complexity:
Time -> O(n)
Space -> O(1)
*/


/*
256:
Array Me 256 Slots Banaye Gaye Hain.

ASCII Me Har Character Ki Ek Unique Value Hoti Hai.

Examples:
'A' -> 65
'a' -> 97
'0' -> 48

Character Ki ASCII Value
Direct Array Index Ban Jati Hai.

Examples:
freq['a']     -> freq[97]
visited['A']  -> visited[65]

Isliye Frequency Count Aur
Duplicate Check Ke Liye 256 Size Ka Array Use Karte Hain.

Used In:
freq[ch]
visited[ch]
count[ch]
*/