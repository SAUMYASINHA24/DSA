// Given an integer array nums, rotate the array to the left by one.
public class LeftRotateByOne {

    public static void main(String args[]) {
        int[] arr = { 3, 7, 2, 8, 1 };
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
        for (int x : arr)
            System.out.println(x);
    }

}
