//Given an integer array nums sorted in non-decreasing order, remove all duplicates 
//in-place so that each unique element appears only once.

//package Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int i = 0, j = i + 1;
        int n = nums.length;
        while (i < n && j < n) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String args[]) {
        int[] arr = { 0, 0, 2, 3, 3, 5, 6 };
        int sizeArr = removeDuplicates(arr);
        for (int i = 0; i < sizeArr; i++) {
            System.out.println(arr[i]);
        }
    }

}
