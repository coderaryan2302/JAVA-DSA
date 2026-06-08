package string;
public class stringBuffer {
    public static void main(String[] args) {

        // 1. StringBuffer Declaration
        StringBuffer str = new StringBuffer("hello");
        System.out.println("StringBuffer = " + str);

        // 2. length()
        System.out.println("Length = " + str.length());

        // 3. capacity()
        System.out.println("Capacity = " + str.capacity());

        // 4. charAt()
        System.out.println("Character At Index 1 = " + str.charAt(1));

        // 5. setCharAt()
        str.setCharAt(0,'d');
        System.out.println("After setCharAt = " + str);

        // 6. append()
        str.append("world");
        System.out.println("After append = " + str);

        // 7. insert()
        str.insert(2,'y');
        System.out.println("After insert = " + str);

        // 8. deleteCharAt()
        str.deleteCharAt(0);
        System.out.println("After deleteCharAt = " + str);

        // 9. reverse()
        str.reverse();
        System.out.println("After reverse = " + str);

        // 10. delete()
        str.delete(2,4); // 2 Inclusive, 4 Exclusive
        System.out.println("After delete = " + str);

        // 11. toString()
        String s = str.toString();
        System.out.println("String = " + s);
    }
}

/*
StringBuffer Methods:
length() -> Current Characters Count
capacity() -> Reserved Memory Size
charAt() -> Access Character
setCharAt() -> Change Character
append() -> Add At End
insert() -> Add At Index
deleteCharAt() -> Delete Character
delete() -> Delete Range
reverse() -> Reverse String
toString() -> Convert To String

String vs StringBuffer:
String -> Immutable
StringBuffer -> Mutable

String Object Change Nahi Hota.
StringBuffer Object Direct Change Ho Jata Hai.

Thread Safe:
Multiple Threads Ek Hi Object Ko
Ek Sath Access Kare To Bhi Data Safe Rehta Hai.

StringBuilder -> Not Thread Safe
StringBuffer -> Thread Safe

Performance:
StringBuilder -> Faster
StringBuffer -> Thoda Slower

Reason:
Thread Safety Maintain Karne Ke Liye
Extra Checking Hoti Hai.

Length vs Capacity:
Length -> Abhi Kitne Characters Hain
Capacity -> Kitne Characters Store Kar Sakta Hai

Example:
StringBuffer sb = new StringBuffer("hello");
Length = 5
Capacity = 21
Why 21 ?
Java Extra Memory Reserve Karta Hai.
Default Capacity = 16

Formula:
Capacity = 16 + String Length
16 + 5 = 21
Capacity Increase:
Jab Capacity Full Ho Jaye To
New Capacity:
(Old Capacity * 2) + 2

Example:
16 -> 34 -> 70 -> 142

delete(start,end)
start -> Inclusive
end -> Exclusive

Revision:
String -> Immutable
StringBuffer -> Mutable

Length -> Used Space
Capacity -> Reserved Space

StringBuilder -> Faster
StringBuffer -> Thread Safe
*/