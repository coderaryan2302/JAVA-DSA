package oops;
public class marksEgOfConstructors {

    static class StudentData {
        String name;          // Student name
        int rollNo;           // Student roll number
        int[] marks;          // Marks array

        // Constructor
        StudentData(int subjects) {
            marks = new int[subjects];      // Dynamic array creation
        }

        void printDetails() {
            System.out.println("Name    : " + name);
            System.out.println("Roll No : " + rollNo);
            System.out.print("Marks   : ");

            int total = 0;                                 // Sum of marks

            for (int mark : marks) {
                System.out.print(mark + " ");
                total += mark;
            }

            double average = (double) total / marks.length;

            System.out.println("\nTotal   : " + total);
            System.out.printf("Average : %.2f%n", average);
        }
    }

    public static void main(String[] args) {

        StudentData s1 = new StudentData(4);      // 4 subjects
        StudentData s2 = new StudentData(2);      // 2 subjects

        s1.name = "Aryan";
        s1.rollNo = 48;

        s2.name = "Atharv";
        s2.rollNo = 60;

        // Marks of Student 1
        s1.marks[0] = 85;
        s1.marks[1] = 35;
        s1.marks[2] = 55;
        s1.marks[3] = 65;

        // Marks of Student 2
        s2.marks[0] = 16;
        s2.marks[1] = 26;

        // s2.marks[2] = 13;
        // Error: ArrayIndexOutOfBoundsException

        System.out.println("----- Student 1 -----");
        s1.printDetails();

        System.out.println("\n----- Student 2 -----");
        s2.printDetails();
    }
}

/*
Important Points:

1. Array object ke andar bhi declare kiya ja sakta hai.

2. Constructor me array initialize karna ek common practice hai.

3. new int[size] dynamic size ka array banata hai.

4. marks.length array ka size batata hai.

5. Valid index:
   0 se (length - 1) tak hota hai.

6. Invalid index access karne par
   ArrayIndexOutOfBoundsException aata hai.

7. Har object ka apna alag array hota hai.
   s1 aur s2 ke marks independent hain.

Interview Points:

- Object ke andar array ho sakta hai.
- Constructor dynamic memory allocation kar sakta hai.
- Array reference bhi instance variable ho sakta hai.
*/