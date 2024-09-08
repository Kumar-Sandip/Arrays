package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoArrayOfNegativeSol_inSingleArray {
    public static void main(String[] args) {
        int[] array1 = {-1, -2, -3};
        int[] array2 = {-4, -5, -6};

        List<Integer> list = new ArrayList<Integer>();
        for (int i : array1) {
            list.add(i);
        }
        for (int i : array2) {
            list.add(i);
        }

        int[] mergedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            mergedArray[i] = list.get(i);
        }

// print the merged array
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
