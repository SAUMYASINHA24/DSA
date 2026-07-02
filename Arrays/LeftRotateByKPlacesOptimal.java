
public class LeftRotateByKPlacesOptimal {
    // Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.

    public static int[] reverseArray(int arr[],int startIndex, int endIndex)
    {
        while(startIndex<=endIndex)
        {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return arr;

    }
    public static void main(String args[]) {
        int[] arr = { 1,2,3,4,5,6,7};
        int k = 3;
        k = k %arr.length;
        
        arr = reverseArray(arr,0,k-1);
        arr = reverseArray(arr, k, arr.length-1);
        arr = reverseArray(arr, 0, arr.length-1);

        for (int x : arr)
            System.out.println(x);
    }

}
