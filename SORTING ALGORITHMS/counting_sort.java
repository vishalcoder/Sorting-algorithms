import java.util.Arrays;

public class counting_sort {
    public static void main(String[] args) {

        /* Counting sort is a sorting algorithm that sorts the elements of an array by counting the number of 
        occurrences of each unique element in the array. 
        The count is stored in an auxiliary array and the sorting is done by mapping the count 
        as an index of the auxiliary array. */

        /* https://www.javatpoint.com/counting-sort 
         * https://www.programiz.com/dsa/counting-sort
        */

        /*
         * Complexity
        Time Complexity	 
        Best	O(n+k)
        Worst	O(n+k)
        Average	O(n+k)
        Space Complexity	O(max)
        Stability	Yes
         */

        /*Time Complexities

        There are mainly four main loops. (Finding the greatest value can be done outside the function.)
        for-loop	time of counting
        1st	O(max)
        2nd	O(size)
        3rd	O(max)
        4th	O(size)
        Overall complexity = O(max)+O(size)+O(max)+O(size) = O(max+size)

        Worst Case Complexity: O(n+k)
        Best Case Complexity: O(n+k)
        Average Case Complexity: O(n+k)
        In all the above cases, the complexity is the same because no matter how the 
        elements are placed in the array, the algorithm goes through n+k times. 
        
        
        There is no comparison between any elements, so it is better than comparison based sorting techniques. 
        But, it is bad if the integers are very large because the array of that size should be made.
        Space Complexity.
        The space complexity of Counting Sort is O(max). 
        Larger the range of elements, larger is the space complexity.*/


        int[] arr = {4,2,2,8,3,3,1};
        int size = arr.length;
        //Create a temporary array
        int[] output = new int[size];

        //Step 1 : Find out the maximum element
        int max_element = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            max_element = Math.max(max_element, arr[i]);
        }

        //Step 2: Intialize a reference array with size of max_element + 1
        int[] reference_arr = new int[max_element + 1];

        //Step 3 : Store the count of respective element in the array 
        for(int i = 0 ; i < arr.length ; i++)
        {
            reference_arr[arr[i]] = reference_arr[arr[i]] + 1;
        }

        System.out.println(Arrays.toString(reference_arr));

        //Step 4 : Store cumulative sum of the elements of the count array. 
        //It helps in placing the elements into the correct index of the sorted array.

        for(int i = 1; i < reference_arr.length ; i++)
        {
            reference_arr[i] = reference_arr[i] + reference_arr[i-1];
        }

        System.out.println(Arrays.toString(reference_arr));

        //Step 5 : Find the index of each element of the original array in the count array.
        // This gives the cumulative count.

        for(int i = size - 1 ; i >= 0 ; i--)
        {
            output[reference_arr[arr[i]] - 1] = arr[i];
            reference_arr[arr[i]]--;
        }

        System.out.println(Arrays.toString(output));



        
    }
    
}
