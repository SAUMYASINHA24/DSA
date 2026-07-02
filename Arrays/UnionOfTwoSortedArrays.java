//package Arrays;

import java.util.ArrayList;
import java.util.List;

// Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
// The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

public class UnionOfTwoSortedArrays {


    public static void main(String args[])
    {
        int[] arr1 = { 1,2,3,4};
        int[] arr2 = {2,3,5};
        int length1 = arr1.length;
        int length2 = arr2.length;
        List<Integer> unionArray = new ArrayList<>();
        
        int i =0;
        int j = 0;
        
        while(i<length1 && j<length2)
        {
            if(arr1[i]<=arr2[j])
            {
                if(!unionArray.contains(arr1[i]))
                {
                    unionArray.add(arr1[i]);
                }
                i++;
            }
            else
            {
                if(!unionArray.contains(arr2[j]))
                {
                    unionArray.add(arr2[j]);
                }
                j++;
            }
        }

        if(i<length1)
        {
            for(int k =i;k<length1;k++)
            {
                if(!unionArray.contains(arr1[k]))
                {
                    unionArray.add(arr1[k]);
                }
            }
            
        }

        if(j<length2)
        {
            for(int k =j;k<length2;k++)
            {
                if(!unionArray.contains(arr2[k]))
                {
                    unionArray.add(arr2[k]);
                }
            }
            
        }

        for(int l =0;l<unionArray.size();l++)
            System.out.println(unionArray.get(l));
    }
    
}
