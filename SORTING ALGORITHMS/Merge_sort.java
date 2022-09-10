import java.util.*;
public class Merge_sort {

        public static void merge(int[] A , int s , int mid , int e)
        {
           int i = s; //start index for the left part
           int j = mid + 1; // start index for the right part

           int k = 0; //K index is to load for the temp array 

           //Declare a temp array of size e - s + 1
           int[] temp = new int[e-s+1];

           while(i <= mid && j <= e)
           {
                if(A[i] <= A[j])
                {
                    temp[k++] = A[i++];
                }
                else
                {
                    temp[k++] = A[j++];
                }

            }

            //To load the remaining elements in the left part to the temp array
            while(i <= mid)
            {
                temp[k++] = A[i++];
            }

            //To load the remaining elements in the right part to the temp array
            while(j <= e)
            {
                temp[k++] = A[j++];
            }

            //Copy back to the original array from the temp array 
            k = 0;
            for(int index = s; index <= e ; index ++)
            {
                A[index] = temp[k++];
            }
            

        }
        public static void merge_sort(int[] A , int s , int e)
        {
            //Divide and conqueour approach
            //Base case
            if(s >= e)
            {
                return;
            }

            //Step 1 : Calculate the mid point
            int mid = (s + e)/2;
 
            //Step 2 : 1st divide across the mid point and call
            merge_sort(A, s, mid);
            
            //Step 3 : Start calling the function from mid + 1 to end
            merge_sort(A, mid + 1, e);

            //Step 4 : Merge the divided function buy calling the merge function
            merge(A,s,mid,e);
        }
        public static void main(String[] args) {

            /*Time Complexity	 
                Best	O(n*log n)
                Worst	O(n*log n)
                Average	O(n*log n)
                Space Complexity	O(n)
                Stability	Yes */

            int[] A = {3,6,2,1,7,5};
            System.out.println(Arrays.toString(A));
            int n = A.length;
            int s = 0;
            int e = n-1;
            merge_sort(A, s, e);

            System.out.println(Arrays.toString(A));
        
    }
}
