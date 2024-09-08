package Arrays.Linear_Search;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {50,60, 20,35,70 , 30, 40 };
        // Use For Each Loop...........
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
