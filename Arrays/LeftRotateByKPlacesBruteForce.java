// Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
public class LeftRotateByKPlacesBruteForce {

    public static void main(String args[]) {
        int[] arr = { 1,2,3,4,5,6,7};
        int k = 3;

        k  = k %arr.length;
        int temp[] = new int[k];

        for(int i =0;i<k;i++)
        {
            temp[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }
        for(int i = k+1;i<arr.length;i++)
        {
            arr[i] = temp[i-k-1];
        }
        for (int x : arr)
            System.out.println(x);
    }

}
