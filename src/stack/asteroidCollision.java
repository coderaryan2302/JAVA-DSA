package stack;

import java.util.Arrays;
import java.util.Stack;

public class asteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            while (!stack.isEmpty()
                    && asteroid < 0
                    && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {

                    stack.pop();

                } else if (stack.peek() == -asteroid) {

                    stack.pop();
                    asteroid = 0;

                } else {

                    asteroid = 0;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] asteroids = {5, 10, -5};

        System.out.println("Input  : "
                + Arrays.toString(asteroids));

        int[] answer = asteroidCollision(asteroids);

        System.out.println("Output : "
                + Arrays.toString(answer));
    }
}

/*

Asteroid Collision

Definition

• Asteroids ek Line me Move karte hain.
• Positive (+) Asteroid Right Direction me aur Negative (-) Asteroid Left Direction me Move karta hai.
• Collision me Chhota Asteroid Destroy ho jata hai.
• Agar dono ka Size Equal ho to dono Destroy ho jate hain.

Concept Used

• Stack
• Collision Simulation

Main Logic

• Har Asteroid ko Traverse karo.
• Collision tabhi hota hai jab Stack Top Positive ho aur Current Asteroid Negative ho.
• Dono ke Size Compare karo.
• Chhota Asteroid Remove karo.
• Equal Size ho to dono Remove ho jate hain.
• Jo Asteroid Bach jaye use Stack me Push karo.
• Last me Stack ko Array me Convert kar do.

Example

Input

5 10 -5

Output

5 10

Time Complexity

• O(n)

Space Complexity

• O(n)

Advantages

• Efficient Linear Time Solution.
• Har Asteroid Maximum ek baar Push aur Pop hota hai.
• Multiple Collisions Automatically Handle ho jati hain.

Disadvantages

• Extra Stack ki Need hoti hai.
• Collision Condition dhyan se samajhna padta hai.

Applications

• Collision Simulation
• Stack Problems
• Physics Based Simulation
• Competitive Programming
• Interview Questions

*/