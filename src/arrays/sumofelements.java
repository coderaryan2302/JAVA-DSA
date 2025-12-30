package arrays;
class sum{
    void demosum() {
        int arr[] = {10,20,30,40,50};
        int sum=0;

        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
public class sumofelements {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.demosum();
    }
}
