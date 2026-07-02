// Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.
public class FindNumberAppearingOnce {

    public static void main(String args[])
    {
        int arr[] = {5};
        int xorValue = 0;
        for(int i =0;i<arr.length;i++)
        {
            xorValue = xorValue^arr[i];
        }
        System.out.println("Number appearing once is : "+xorValue);
    }
    
}
