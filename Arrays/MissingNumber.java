// Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
public class MissingNumber {

    public static void main(String args[])
    {
        int arr[] = {0, 1, 2, 4, 5, 6};

        int n = arr.length;

        int idealSumValue = (n*(n+1))/2;

        int sum =0;
        for(int i =0;i<n;i++)
        {
            sum = sum +arr[i];
        }

        System.out.println("Missing number is : "+(idealSumValue - sum));
    }
    

    
}
