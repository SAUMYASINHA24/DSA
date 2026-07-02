
import java.util.ArrayList;
import java.util.List;

// Given two sorted arrays nums1 and nums2, return an array that contains the intersection of these two arrays. The elements in the intersection must be in ascending order.
// The intersection of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

public class IntersectionOfTwoSortedArrays {

    public static void main(String args[])
    {
        int[] arr1 = { 1,2,2,3,3,8,9,10};
        int[] arr2 = {1,1,2,2,3};
        int length1 = arr1.length;
        int length2 = arr2.length;
        List<Integer> intersectionArray = new ArrayList<>();
        
        int i =0;
        int j = 0;
        
        while(i<length1 && j<length2)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i] == arr2[j])
            {
                if(!intersectionArray.contains(arr1[i]))
                {
                    intersectionArray.add(arr1[i]);
                }
                j++;
                i++;
            }
            else if(arr1[i]>arr2[j])
                j++;
        }

        for(int l =0;l<intersectionArray.size();l++)
            System.out.println(intersectionArray.get(l));
    }
    
    
}
