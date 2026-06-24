// Given an array of integers nums, return the second-largest element in the array. 
//If the second-largest element does not exist, return -1.

public class SecondSmalledElement {

    public static int findSecondLargest(int[] nums) {
        int smallestElement = Integer.MAX_VALUE;
        int secondSmallestElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = nums[i];
            } else if (nums[i] > smallestElement && nums[i] < secondSmallestElement) {
                secondSmallestElement = nums[i];
            }
        }

        return secondSmallestElement;

    }

    public static void main(String args[]) {
        int[] arr = { 38, 72, 39, 81, 10 };
        // int[] arr = { 10, 10, 10, 10, 10 };
        System.out.println(findSecondLargest(arr));
    }

}
