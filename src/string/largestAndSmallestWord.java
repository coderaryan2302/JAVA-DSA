package string;
import java.util.*;
public class largestAndSmallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");

        String str = sc.nextLine(); // Input Sentence

        String[] words = str.split(" ");     // Split String Into Words Using Space

        String largest = words[0];
        String smallest = words[0];

        for(int i = 1; i < words.length; i++){
            if(words[i].length() > largest.length()){
                largest = words[i];
            }
            if(words[i].length() < smallest.length()){
                smallest = words[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}

/*
Input:
I love physics wallah

Output:
Largest = physics
Smallest = I

Logic:
Split Sentence Into Words.
Compare Length Of Each Word.

Complexity:
Time -> O(n)
Space -> O(n)

Revision:
split(" ")
*/