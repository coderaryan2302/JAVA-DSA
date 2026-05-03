package arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ascendingAndDescendingOrderSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);
        System.out.println("orginal list " + list);

        Collections.sort(list);                                    // inbuilt function
        System.out.println("ascending order " + list);

        Collections.sort(list , Collections.reverseOrder());      // inbuilt function
        System.out.println("descending order " + list);
    }
}
