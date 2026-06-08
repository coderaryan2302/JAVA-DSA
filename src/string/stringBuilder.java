package string;
public class stringBuilder {
    public static void main(String[] args) {

        // 1. StringBuilder Declaration
        StringBuilder str = new StringBuilder("hello");
        System.out.println("StringBuilder = " + str);

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
        // str.append(10); // int bhi add kar sakte hain
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
StringBuilder Methods:
length() -> Length
capacity() -> Capacity
charAt() -> Access Character
setCharAt() -> Change Character
append() -> Add At End
insert() -> Add At Index
deleteCharAt() -> Delete One Character
delete() -> Delete Range
reverse() -> Reverse String
toString() -> Convert To String

Important:
String Immutable Hai -> Object Nahi Badalta, Reference Badalta Hai (Object Modify Nahi Hota.
Change Karne Par New Object Banta Hai).
StringBuilder:
StringBuilder -> Mutable
Object Direct Modify Hota Hai.
Better For Multiple Modifications.


Default Capacity = 16
New Capacity = (Old Capacity * 2) + 2

delete(start,end)
start -> Inclusive
end -> Exclusive


*/