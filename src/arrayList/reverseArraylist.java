package arrayList;
import java.util.ArrayList;
public class reverseArraylist {
    static void reverse(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
           Integer temp = Integer.valueOf(list.get(i));
           list.set(i,list.get(j));
           list.set(j,temp);
           i++;
           j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);
        System.out.println("orginal list " + list);
        reverse(list);
        System.out.println("reverse list " + list);
    }
}
