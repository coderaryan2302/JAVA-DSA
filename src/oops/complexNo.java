package oops;
class ComplexNumber {
    int real;          // Real part
    int imaginary;     // Imaginary part

    // Constructor
    ComplexNumber(int real, int imaginary) {
        this.real = real;               // Initialize real part
        this.imaginary = imaginary;     // Initialize imaginary part
    }

    // Addition
    void add(ComplexNumber number) {
        this.real += number.real;               // Add real parts
        this.imaginary += number.imaginary;     // Add imaginary parts
    }

    // Multiplication
    void multiply(ComplexNumber number) {
        int newReal = (this.real * number.real) - (this.imaginary * number.imaginary);              // ac - bd
        int newImaginary = (this.real * number.imaginary) + (this.imaginary * number.real);        // ad + bc
        this.real = newReal;               // Update real part
        this.imaginary = newImaginary;     // Update imaginary part
    }

    // Division
    void divide(ComplexNumber number) {
        int denominator = (number.real * number.real) + (number.imaginary * number.imaginary);     // c² + d²
        if (denominator == 0) {
            System.out.println("Division by zero is not possible.");
            return;
        }
        double newReal = (double) ((this.real * number.real) + (this.imaginary * number.imaginary));        //  denominator;
        double newImaginary = (double) ((this.imaginary * number.real) - (this.real * number.imaginary));   // denominator;
        System.out.printf("Division Result : %.2f %+.2fi%n", newReal, newImaginary);                        // Display result
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";     // Positive imaginary part
        }
        return real + " - " + (-imaginary) + "i";      // Negative imaginary part
    }
}

public class complexNo {
    public static void main(String[] args) {

        ComplexNumber z1 = new ComplexNumber(2, -5);     // 2 - 5i
        ComplexNumber z2 = new ComplexNumber(3, 4);      // 3 + 4i

        System.out.println("Initial Complex Numbers:");
        System.out.println("z1 = " + z1);      // Calls toString()
        System.out.println("z2 = " + z2);

        System.out.println("\nAfter Addition:");
        z1.add(z2);                            // z1 = z1 + z2
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        System.out.println("\nAfter Multiplication:");
        z2.multiply(z1);                       // z2 = z2 × z1
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        System.out.println("\nDivision of z1 by z2:");
        z1.divide(z2);                         // z1 ÷ z2
    }
}

/*
Important Points:

1. Complex Number ka form hota hai:
   a + bi
   a = real part, b = imaginary part.

2. Addition:
   (a + bi) + (c + di)
   = (a + c) + (b + d)i

3. Multiplication:
   (a + bi)(c + di)
   = (ac - bd) + (ad + bc)i

4. Multiplication me temporary variables use karna zaroori hai,
   warna updated value se calculation galat ho sakti hai.

5. Division:
   [(ac + bd) / (c² + d²)]
   + [(bc - ad) / (c² + d²)]i

6. Division se pehle denominator check karna chahiye,
   warna division by zero ho sakta hai.

7. toString() method object ko direct print karne me help karta hai.

Interview Points:
- this current object ko refer karta hai.
- Ek object dusre object ko method parameter ke roop me le sakta hai.
- @Override batata hai ki hum parent class ka method redefine kar rahe hain.
*/