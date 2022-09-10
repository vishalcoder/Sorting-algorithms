import java.util.*;
public class Quick_sort {
    public static int partition(int[]A , int s , int e)
    {
        //Consider the last element as pivot and try to get all the lesser elements than pivot
        // to the left of the pivot and all the elements greater than pivot to the right of pivot

        int pivot = A[e];
        
        //Take the start index as s-1
        int i = s-1;
        for(int j = s ; j <= e-1 ; j++)
        {
            if(A[j] <= pivot)
            {
                //Increment i++ since it is starting from -1
                i++;

                //Swap ith element and jth element
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        //Now till ith element all the elements will be less than pivot and from jth element till pivot 
        //all the elements will be greater than pivot 
        // ith - lesser than pivot , jth - Greater than pivot

        //Now to place pivot since till ith element all the elements will be lesser we can place pivot in
        // the i+1th place

        //Swap function
        int temp = A[i+1];
        A[i+1] = A[e];
        A[e] = temp;

        return i+1;

    }
    public static void qui__sort(int[]A , int s, int e)
    {
        if(s >= e)
        {
            return;
        }

        //Partition along the pivot index 
        int pivot_index = partition(A , s , e);

        //First recursive call from start to pivot - 1
        qui__sort(A , s, pivot_index-1);

        //Second recursive call from  pivot+1 to end
        qui__sort(A , pivot_index + 1, e);     

    }
    public static void main(String[] args) {

        /*Quicksort Complexity
            Time Complexity	 
            Best	 = O(n*log n)
            Worst	 = O(n2)
            Average	 = O(n*log n)
            Space Complexity	= O(log n)
            Stability	= No
        */
        
        int[] A = {3,7,1};
        System.out.print("Before sorting : ");
        System.out.println(Arrays.toString(A));
        int n = A.length;
        int s = 0;
        int e = n-1;
        qui__sort(A,s,e);

        System.out.print("Before sorting : ");
        System.out.println(Arrays.toString(A));


    }
    
}
