package arrays;
class maximum{
    void demomaximum() {
        int arr[] = {10, 20, 30, 40, 50};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
            System.out.println("max is " + max );

    }
}
public class maximumvalueofelements {
    public static void main(String[] args) {
        maximum obj =new maximum();
        obj.demomaximum();
    }
}

