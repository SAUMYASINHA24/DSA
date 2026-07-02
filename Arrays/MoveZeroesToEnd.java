public class MoveZeroesToEnd {

    public static void main(String args[])
    {
        int[] arr = { 0, 0, 2, 3, 3, 5, 6 };
        
        int i =0;
        int j = i+1;
        while(i<arr.length && j<arr.length)
        {
            if(arr[j]!=0)
            {
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
            else
                j++;
        }
        for(int x : arr)
            System.out.println(x);
    }
    
}
