package arrays;
class searchelement {
    void presentelement() {

        //case 1 (ek hee baar aaya ho)
//        int arr[] = {10, 20, 30, 40, 50};
//        int x = 30;
//        int ans = -1;            // ye hum isliye liye agr koi aisa element x ke jagah pe dey jo array mai n ho tb wo answer dey ga -1
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                ans = i;
//            }
//        }
//        System.out.println("element x at index " + ans);


        //case 2 (phli baar kon se index pe aaya hai)
//        int arr[] = {10, 20, 30, 40, 50, 30};
//        int x = 30;
//        int ans = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if ((arr[i] == x) && (ans==-1)) {
//                ans = i;
                // break;                                 // break keyword bhi use kr skte hai and condition ke bina
//                System.out.println("element x at index " + ans);
//            }
//        }
//

       //case 3 (multiple index pe kab kab aaya hai)
//        int arr[] = {10, 20, 30, 40, 50, 30};
//        int x = 30;
//        int ans = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x)  {
//                ans = i;
//            }
//            System.out.println("element x at index " + ans);
//        }

      //  case  (last index pe kab aaya hai)
//        int arr[] = {10, 20, 30, 40, 50, 30};
//        int x = 30;
//        int ans = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x)  {
//                ans = i;
//            }
//        }
//        System.out.println("element x at index " + ans);


    }
}
        public class elementxispresentinarray {
        public static void main(String[] args) {
            searchelement obj = new searchelement();
            obj.presentelement();
        }
    }

