import java.util.*; 

public class MaximumConsecutiveZeroes {

    // Given a binary array nums, return the maximum number of consecutive 1s in the array.
    public static void main(String args[])
    {
        int arr[] = {1, 1, 0, 0, 1, 1, 1, 0};
        int maxLength = 0;
        int tempLength = 0 ;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == 1)
            {
                tempLength++;
                if(tempLength > maxLength)
                    maxLength = tempLength;

                
            }
            else
                    tempLength = 0;
        }

        System.out.println("Maximum consecutive ones are : "+maxLength);
    }
    
}
