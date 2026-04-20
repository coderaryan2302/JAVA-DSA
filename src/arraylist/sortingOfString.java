package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class sortingOfString {
    public static void main(String[] args) {
        ArrayList<String>l1=new ArrayList<>();
        l1.add("b");
        l1.add("d");
        l1.add("c");
        l1.add("a");
        System.out.println("orginal list" + l1);

        Collections.sort(l1);
        System.out.println("ascending order sorted list" + l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("descending order sorted list" + l1);
    }
}

// string mai level wise letter ke acc. se sorting hoti hai ...
// welcome or wallah 2 words hai too ..
// W dono mai hai pr next level letter A or E hai to ans ho ga Wallah phle then Welcome