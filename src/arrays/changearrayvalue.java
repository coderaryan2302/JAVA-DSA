package arrays;
class changevalueofarray{
    static void changevalue(int arr[]) {
        for (int i=0; i<arr.length;i++) {
            arr[i]=1;
        }
    }
}
public class changearrayvalue {
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;

       changevalueofarray.changevalue(arr);

       for (int i=0 ; i< arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
