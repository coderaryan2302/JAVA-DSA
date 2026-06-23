package oops;
public class passingClassesToMethods {

    static class Car {
        int seats;          // Number of seats
        String name;        // Car name
        double length;      // Car length

        void printDetails() {
            System.out.println("Name   : " + name);      // Display name
            System.out.println("Seats  : " + seats);     // Display seats
            System.out.println("Length : " + length);    // Display length
        }
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.seats = 5;
        c.name = "Kia Sonet";
        c.length = 170.5;

        System.out.println("Before change():");
        c.printDetails();

        change(c);                            // Reference ki copy pass hoti hai

        System.out.println("\nAfter change():");
        c.printDetails();
    }

    // Object ko method me pass karna
    static void change(Car car) {
        car.seats = 4;                        // Original object modify ho jayega
        car.name = "Kia Seltos";              // Name bhi change ho jayega
    }

    /*
    static void change(Car x) {
        x.seats = 4;
        x bhi usi object ko point karta hai
        jise c refer kar raha tha.
    }
    */
}

/*
Important Points:
1. Java ALWAYS Pass By Value hoti hai.
2. Object pass karte time object ka reference pass nahi hota,
   balki reference ki COPY pass hoti hai.
3. Dono references same object ko point karte hain,
   isliye object ke andar ki changes reflect hoti hain.
4. Isliye change(c) call karne ke baad c ke data me changes dikhte hain.
5. Primitive variables (int, double, char) ki changes
   original variable par reflect nahi hoti.

Interview Points:
- Java is NOT Pass By Reference.
- Java is ALWAYS Pass By Value.
- For objects, value = reference ki copy hoti hai.
- Object state change ho sakta hai.
- Original reference ko replace nahi kar sakte.
*/