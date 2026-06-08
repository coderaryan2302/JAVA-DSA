package string;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st string ");
        String s1 = sc.nextLine();
        System.out.println("enter 2nd string ");
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[256];
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(freq[i] != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}

/*
Input:
listen
silent

Output:
Anagram

Logic:
Increase Frequency For First String.
Decrease Frequency For Second String.

All Frequencies Must Become 0.

Complexity:
Time -> O(n)
Space -> O(1)

Revision:

Anagram -> Same Characters Same Frequency
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