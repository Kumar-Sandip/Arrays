package Arrays;

public class MergeTwoSortedArray_inSingleArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 9, 15, 33};
        int[] arr2 = {1, 14, 24, 29, 37};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("The merged array is: ");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
