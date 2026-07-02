//package Arrays;

// Problem Statement: Given an array, we have to find the largest element in the
// array.
import java.util.*;

public class LargestElement {

    public static int findLargest(int[] arr) {
        int largestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 7, 2, 8, 1 };
        System.out.println(findLargest(arr));
    }
}