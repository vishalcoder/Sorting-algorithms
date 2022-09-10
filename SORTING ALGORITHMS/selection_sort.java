import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        
         /* 
        Time Complexity	 
        Best	            O(n2)
        Worst	            O(n2)
        Average	            O(n2)
        Space Complexity	O(1)
        Stability	No
        */

        // Selection sort 
        int[] arr = {20,12,10,15,2};
        System.out.print("Original array = ");
        System.out.println(Arrays.toString(arr));

        //Length of the array :
        int n = arr.length;
        
        //Iterate over n-2 elements
        for(int i = 0 ; i < n-1 ; i++)
        {
            //Treat first index as the minimum element and store it in the temp later to swap
            int temp_min = i;
            for(int j = i+1 ; j < n ; j++)
            {
                if(arr[j] < arr[temp_min])
                {
                    temp_min = j;
                }
            }

            //Perform the swap operation with the minimum value in the iteration with the ith element
            int temp = arr[temp_min];
            arr[temp_min] = arr[i];
            arr[i] = temp;
            
        } 

        System.out.print(" Sorted array = ");
        System.out.println(Arrays.toString(arr));


       
    }
    
}
