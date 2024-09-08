package Arrays;

public class onezero {
    public static void swap(int arr[]){
        int j=arr.length;
        for (int i=0; i<arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void zero_one_print(int []arr) {
        int  j=arr.length-1;
        int i=0;
        while (i<j){
            if (arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,0,0,1,1,0};
        zero_one_print(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
