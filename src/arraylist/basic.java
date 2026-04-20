// ArrayList ek dynamic array hota hai jo size automatically badha ya ghata sakta hai jab hum elements add ya remove karte hain.

package arraylist;
import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {

        // syntax for create arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(7);
        l1.add(6);
        l1.add(8);

        //get an element at index i
        System.out.println(l1.get(0));  // ans=5
        System.out.println(l1.get(1));  // ans=7

        // print with for loop
        for (int i = 0; i < l1.size() ; i++) {
            System.out.println((l1.get(i)));   // ans = 5,7,6,8   ( next line mai ho ga )
        }

        // print the arraylist directly
        System.out.println(l1);    // ans = [5,7,6,8]

        // add elements at some index i // [5,100,7,6,8]
        l1.add(1,100);
        System.out.println(l1);

        // modify element at index i
        l1.set(1,10);
        System.out.println(l1);    // ans = [5,10,7,6,8]

        // remove an element at index i
        l1.remove(1);
        System.out.println(l1);   // ans = [5,7,6,8]

        // remove an element e
        System.out.println(l1.remove(Integer.valueOf(7)));   // boolean return karega (ans = true)
//      System.out.println(l1.remove(Integer.valueOf(17)));    // boolean return karega (ans = true)
        l1.remove(Integer.valueOf(7));                      // agr koi aisi value dey de jo exist nhi krti ho too wo case m koi error nhi dey ga
        System.out.println(l1);   // ans = [5,6,8]

        // checking if an element exist
        boolean ans = l1.contains(Integer.valueOf(8));      // agr koi or value dey jo exist nhi krta hai to ans false dey ga
        System.out.println(ans);         // ans = true

        // if you don't specify class you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("abcdef");
        l.add(1001);
        l.add(true);
        System.out.println(l);

    }
}
