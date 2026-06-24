// Given an array of integers nums, return the second-largest element in the array. 
//If the second-largest element does not exist, return -1.
package Arrays;

public class SecondLargestElement {

    public static int findSecondLargest(int[] nums) {
        int largestElement = -1;
        int secondLargestElement = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = nums[i];
            } else if (nums[i] > secondLargestElement && nums[i] < largestElement) {
                secondLargestElement = nums[i];
            }
        }

        return secondLargestElement;

    }

    public static void main(String args[]) {
        // int[] arr = { 3, 7, 2, 8, 1 };
        int[] arr = { 10, 10, 10, 10, 10 };
        System.out.println(findSecondLargest(arr));
    }

}
