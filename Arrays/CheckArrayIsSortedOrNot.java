package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        // int[] arr = { 3, 7, 2, 8, 1 };
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(isSorted(arr));
    }

}
