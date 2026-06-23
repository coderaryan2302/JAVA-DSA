package oops;
public class revisionExample {

    private static class Pokemon {
        int speed;         // Pokemon speed
        String name;       // Pokemon name

        // Constructor
        Pokemon(String name, int speed) {
            this.name = name;       // Initialize name
            this.speed = speed;     // Initialize speed
        }

        void print() {
            System.out.println("Name  : " + name);
            System.out.println("Speed : " + speed);
        }
    }

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Lizard", 100);      // First object
        Pokemon p2 = new Pokemon("Pikachu", 150);     // Second object

        System.out.println("Initial Objects:");

        System.out.println("\np1:");
        p1.print();

        System.out.println("\np2:");
        p2.print();


        // Reference Copy
        Pokemon p3 = p1;                              // p3 and p1 point to same object

        p3.name = "Charizard";                        // Change through p3
        p3.speed = 250;

        System.out.println("\nAfter Changing p3:");

        System.out.println("\np1:");
        p1.print();                                   // Changes reflect in p1

        System.out.println("\np3:");
        p3.print();

        // Uncommenting below line will give error
        // Pokemon p4 = new Pokemon();
        // Error: No default constructor exists
    }
}

/*
================ Important Points ================

1. Object variable object ko store nahi karta,
   balki object ka reference store karta hai.

2. Pokemon p3 = p1;
   Isme naya object nahi banta.

3. p1 aur p3 dono same object ko point karte hain.

4. p3 se changes karne par p1 me bhi changes dikhte hain.

5. Constructor with parameters define karne par
   Java default constructor automatically nahi banata.

Interview Points:

- Reference Copy:
      Pokemon p3 = p1;

- Same Object:
      p1 == p3   → true

- Constructor Overloading karne par default constructor
  manually banana pad sakta hai.

====================================================
*/