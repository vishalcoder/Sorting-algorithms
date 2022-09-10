import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        
        /*Insertion Sort Complexity
            Time Complexity	 
            Best	            O(n)
            Worst	            O(n2)
            Average	            O(n2)
            Space Complexity	O(1)
            Stability	        Yes 
            
        We assume that the first card is already sorted then, we select an unsorted card. 
        If the unsorted card is greater than the card in hand, it is placed on the right otherwise, 
        to the left. In the same way, other unsorted cards are taken and put in their right place.*/

        int[] arr = {9,5,4,1,3};

        //Declare n for the length of the array
        int n = arr.length;
        

        //Here u should iterate till the element since we are considering each element to be as a key to compare
        //Start from 1 because u need to compare from before
        for(int i = 1; i < n ; i++)
        {
            int j = i-1;
            int temp = arr[i];

            //Now loop and see backwards if there is any element greater  than the temp element 
            // if it is present then place it at j+1th place (i.e) shift the current element to the right of it
            // so smaller element has to occupy the current position 
            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }

            //Now place the temp value in the j+1th position 
            // why j+1 because we are decremiting j in line 30
            arr[j+1] = temp;
        }

        System.out.println(Arrays.toString(arr));

        
        
    }
    
}
