package oops;
public class standardInbuiltFunction {

    public static void main(String[] args) {

        // Square Root
        System.out.println("Square Root:");
        System.out.println("sqrt(24) = " + Math.sqrt(24));      // √24
        System.out.println("sqrt(16) = " + Math.sqrt(16));      // √16

        // Floor
        System.out.println("\nFloor:");
        System.out.println("floor(5.3) = " + Math.floor(5.3));  // Lowest integer
        System.out.println("floor(5.8) = " + Math.floor(5.8));

        // Ceil
        System.out.println("\nCeil:");
        System.out.println("ceil(5.3) = " + Math.ceil(5.3));    // Highest integer
        System.out.println("ceil(5.8) = " + Math.ceil(5.8));

        // Power
        System.out.println("\nPower:");
        System.out.println("pow(2, 3) = " + Math.pow(2, 3));    // 2³
        System.out.println("pow(5, 2) = " + Math.pow(5, 2));    // 5²
    }
}

/*
Standard Inbuilt Math Functions
1. Math.sqrt(x)
   → x ka square root return karta hai.

   Example:
   sqrt(16) = 4.0
   sqrt(24) = 4.89...

   Note:
   Perfect square hona zaroori nahi hai.

2. Math.floor(x)
   → x se chhota ya barabar nearest integer return karta hai.

   Example:
   floor(5.3) = 5.0
   floor(5.8) = 5.0
   floor(-5.3) = -6.0


3. Math.ceil(x)
   → x se bada ya barabar nearest integer return karta hai.

   Example:
   ceil(5.3) = 6.0
   ceil(5.8) = 6.0
   ceil(-5.3) = -5.0


4. Math.pow(x, y)
   → x ki power y return karta hai.

   Example:
   pow(2, 3) = 8.0
   pow(5, 2) = 25.0


Important Points:
1. Math class java.lang package ka part hai.
2. Math methods static hote hain.
3. Math class ko import karne ki zaroorat nahi hoti.
4. In methods ka return type generally double hota hai.

Interview Points:
✓ Math.sqrt()  → Square Root
✓ Math.floor() → Nearest Lower Integer
✓ Math.ceil()  → Nearest Higher Integer
✓ Math.pow()   → Power

Easy Revision:
sqrt → Square Root
floor → Down
ceil → Up
pow → Power

*/