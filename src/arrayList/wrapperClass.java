package arrayList;

public class wrapperClass {

    public static void main(String[] args) {

        // Wrapper Class Objects
        Integer number = Integer.valueOf(4);
        System.out.println("Integer Value = " + number);

        Float decimalNumber = Float.valueOf(5.5f);
        System.out.println("Float Value = " + decimalNumber);
    }
}

/*
Wrapper Class

Definition
• Wrapper Class primitive data types ko object me convert karti hai.

Working
• valueOf() method primitive value ka object banata hai.
• Wrapper object ko normal object ki tarah use kar sakte hain.

Wrapper Classes

byte    → Byte
short   → Short
int     → Integer
long    → Long
float   → Float
double  → Double
char    → Character
boolean → Boolean

Key Points
• ArrayList sirf objects store karti hai, isliye Wrapper Classes use hoti hain.
• valueOf() object create karne ka recommended method hai.
• new Integer() aur new Float() constructors deprecated ho chuke hain.
• Java Autoboxing aur Unboxing ko support karti hai.

Autoboxing
• Primitive → Wrapper Object

Example
int a = 10;
Integer num = a;

Unboxing
• Wrapper Object → Primitive

Example
Integer num = 10;
int a = num;

Time Complexity : O(1)
Space Complexity : O(1)

Revision
• Primitive → Wrapper
• int → Integer
• float → Float
• valueOf() recommended
• Supports Autoboxing and Unboxing
*/