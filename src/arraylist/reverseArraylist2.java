package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class reverseArraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);
        System.out.println("orginal list " + list);
        Collections.reverse(list);                  // inbuilt function
        System.out.println("reverse list " + list);
    }
}
