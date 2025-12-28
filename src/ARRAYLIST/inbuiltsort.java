package ARRAYLIST;

import java.util.Arrays;

public class inbuiltsort {
    public static void main(String[] args) {
        int[] arr={12,223,21,45,89};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
