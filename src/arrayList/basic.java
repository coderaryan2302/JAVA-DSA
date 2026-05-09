// ArrayList ek dynamic array hota hai jo size automatically badha ya ghata sakta hai
// jab hum elements add ya remove karte hain.

package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- CREATE ARRAYLIST ----------------
        // syntax for create arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();

        // ---------------- USER INPUT ----------------
        System.out.print("Kitne elements add karna chahte ho : ");
        int n = sc.nextInt();
        System.out.println("Elements enter karo : ");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());      // user se elements lekar arraylist me add kar rahe hain
        }

        // ---------------- ADD NEW ELEMENT ----------------
        l1.add(5);
        l1.add(7);
        l1.add(6);
        l1.add(8);

        // ---------------- GET ELEMENT ----------------
        System.out.println(l1.get(0));   // ans = first element
        System.out.println(l1.get(1));   // ans = second element

        // ---------------- PRINT USING LOOP ----------------
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));   // ek ek element next line mai print hoga
        }

        // ---------------- PRINT DIRECTLY ----------------
        System.out.println(l1);   // pura arraylist ek sath print hoga

        // ---------------- ADD ELEMENT AT INDEX ----------------
        l1.add(1,100);   // index 1 par 100 add ho jayega
        System.out.println(l1);

        // ---------------- MODIFY ELEMENT ----------------
        l1.set(1,10);   // index 1 ki value 100 se 10 ho jayegi
        System.out.println(l1);

        // ---------------- REMOVE USING INDEX ----------------
        l1.remove(1);   // index 1 ka element remove ho jayega
        System.out.println(l1);

        // ---------------- REMOVE USING VALUE ----------------
        System.out.println(l1.remove(Integer.valueOf(7)));   // value mili to true return karega
 //     System.out.println(l1.remove(Integer.valueOf(17)));   // value nahi mili to false return karega
        l1.remove(Integer.valueOf(7));   // agar value exist nahi karti ho to koi error nahi dega
        System.out.println(l1);   // ans = [5,6,8]

        // ---------------- CHECK ELEMENT EXIST OR NOT ----------------
        boolean ans = l1.contains(Integer.valueOf(8));   // present hua to true warna false
        System.out.println(ans);

        // ---------------- TOTAL ELEMENTS ----------------
        System.out.println(l1.size());   // total elements count karega

        // ---------------- CHECK EMPTY OR NOT ----------------
        System.out.println(l1.isEmpty());   // list empty hui to true warna false

        // ---------------- USER VALUE CHECK ----------------
        System.out.print("Check karne ke liye element enter karo : ");
        int x = sc.nextInt();
        System.out.println(l1.contains(x));   // user wala element present hai ya nahi check karega

        // ---------------- LAST ELEMENT ----------------
        System.out.println(l1.get(l1.size() - 1));   // last element print karega

        // ---------------- MIXED DATA TYPE ----------------
        // if you don't specify class you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("abcdef");
        l.add(1001);
        l.add(true);
        System.out.println(l);   // different data types store ho jayenge

    }
}