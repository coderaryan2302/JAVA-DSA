package string;
public class printSubstring {
    public static void main(String[] args) {
        String str = "abcd";

        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                System.out.print("substring: " + str.substring(i,j) + " ");       // Print Substring
            }
        }
        System.out.println();
    }
}

/*
Input: abcd

Output: a ab abc abcd b bc bcd c cd d

Logic:
i -> Start Index
j -> End Index

Generate All Possible Substrings.

Important:
substring(i,j)
i -> Inclusive
j -> Exclusive

Total Substrings: n(n+1)/2

Complexity:
Time -> O(n²)
Space -> O(1)

Revision:
Generate All Substrings -> 2 Loops
substring(i,j) -> i Inclusive, j Exclusive
*/