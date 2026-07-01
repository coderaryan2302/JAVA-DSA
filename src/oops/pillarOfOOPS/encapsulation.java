package oops.pillarOfOOPS;
class Students {

    private int rollNo;          // Hidden data
    private String name;         // Hidden data

    // Setter
    void setRollNo(int rollNo) {
        this.rollNo = rollNo;    // Update roll number
    }

    void setName(String name) {
        this.name = name;        // Update name
    }

    // Getter
    int getRollNo() {
        return rollNo;                    // Read roll number
    }

    String getName() {
        return name;                     // Read name
    }

    void print() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Students s = new Students();

        s.setName("Aryan");
        s.setRollNo(48);

        s.print();

        System.out.println("Getter Name : " + s.getName());
        System.out.println("Getter Roll : " + s.getRollNo());

        // s.rollNo = 100;
        // Error: rollNo is private
    }
}

/*
Encapsulation:
→ Data aur methods ko ek unit me bind karna.
→ Data ko direct access se protect karna.

private:
→ Direct access ko rokta hai.

Getter:
→ Value read karta hai.

Setter:
→ Value update karta hai.

Important Points:
1. Data Hiding provide karta hai.
2. Controlled access deta hai.
3. Security improve hoti hai.

Interview Line:
"Encapsulation means wrapping data and methods
into a single unit and restricting direct access."

*/

