package Arrays;

import javax.naming.PartialResultException;

public class partitionArray {
    public static void Partition(int [] arr , int pivot  ) {
        // some conditions..
        // 0 to j  - 1 --> <=  piovt..
        //j to i  - 1 -> > pivot
        //  i to  end  -> unkonwn
        int i = 0 ; 
        int j = 0 ;
         while (i<arr.length) {
            if(arr[i]> pivot){
                i++;

            }else{
            swap (arr , i, j);
                i++;
                j++;
            }
            
            Partition(arr, pivot);
         }
        
    }

    private static void swap(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swap'");
        
    }}

