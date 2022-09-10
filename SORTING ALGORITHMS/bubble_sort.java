import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {

        /*Bubble Sort Complexity
            Time Complexity	 
            Best	            O(n)
            Worst	            O(n2)
            Average	            O(n2)
            Space Complexity	O(1)
            Stability	Yes */
        
        //TC : O(N^2) SC : O(1)
        //Bubble sorting 
        int[] arr = {-2,45,0,11,-9};
        
        //length of the arr
        int n = arr.length;

        /* Apporach : Optimized by checking visited */
        // loop to access each array element
        for(int i = 0 ; i < n-1 ; i++)
        {
            //so to optimize keep a boolean variable because sometime if the array is sorted in first case it will continue for remaining also 
            boolean sorted = false;
            // loop to compare array elements
            for(int j = 0 ; j < n-i-1 ; j++)
            {
                // compare two adjacent elements
                // change > to < to sort in descending order
                if(arr[j] >arr[j+1])
                {
                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    //set the boolean to true since sorting has happened
                    sorted = true;
                }
            }

            //No swapping has happened that means the array is sorted no need to check for remaining elements
            if(!sorted)
            {
                break;
            }
        }







        /* Approach : Naive 
        // loop to access each array element
        for(int i = 0 ; i < n-1 ; i++)
        {
            // loop to compare array elements
            for(int j = 0 ; j < n-i-1 ; j++)
            {
                // compare two adjacent elements
                // change > to < to sort in descending order
                if(arr[j] >arr[j+1])
                {
                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } */

        System.out.println(Arrays.toString(arr));
    }
}
