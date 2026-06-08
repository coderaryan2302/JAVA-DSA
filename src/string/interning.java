package string;
public class interning {
    public static void main(String[] args) {
        String s = "hello";    // String Pool Object
        String x = "hello";    // Same Object Reference

        x = "mello";           // x Points To New String

        System.out.println("final ans: " +  s);
    }
}

/*
Output: hello

Concept:
String s = "hello";
String x = "hello";
s aur x dono same String Pool Object ko point karte hain.
x = "mello";
Yahan "hello" modify nahi hoti.
Sirf x ka reference new String par shift ho jata hai.

Memory:
Before:
s ---> "hello"
x ---> "hello"
After:
s ---> "hello"
x ---> "mello"

Interning:
String a = "hello";
String b = "hello";
Java same String Object reuse karta hai.
a == b  -> true

new Keyword:
String a = "hello";
String b = new String("hello");
new hamesha naya object create karta hai.
a == b       -> false
a.equals(b)  -> true

Performance:
String str = "hello";            // Better
String str = new String("hello"); // Extra Object

Revision:
Interning -> Object Reuse
new -> New Object Create
== -> Address Compare
equals() -> Content Compare
String -> Immutable

Important points:
String Literal -> String Pool
new String() -> Heap Memory
Example:
String s1 = "hello";             // String Pool
String s2 = new String("hello"); // Heap Memory

String Immutable Hai -> Object Nahi Badalta, Reference Badalta Hai (Object Modify Nahi Hota.
Change Karne Par New Object Banta Hai).

StringBuilder:
StringBuilder -> Mutable
Object Direct Modify Hota Hai.
Better For Multiple Modifications.

*/