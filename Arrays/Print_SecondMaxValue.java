package Arrays;

public class Print_SecondMaxValue {
    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 12, 13, 23, 20, 34, 200};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
//            if (arr[i]>mx) mx = arr[i];
            mx = Math.max(mx, arr[i]);
        }

      //  System.out.println("Maximum number is : " + mx);

        int smx = Integer.MIN_VALUE;//print second largest number in the Array
        for (int i = 0; i < n; i++) {
            if (arr[i] > smx && arr[i] !=mx) smx =arr[i];
            if(arr[i] !=mx) smx = Math.max(smx,arr[i]);
//            if (arr[i]>mx) mx = arr[i];
               // smx = Math.max(smx, arr[i]);
        }
        System.out.println("Maximum number is : " + mx);
        System.out.println("Second largest value:"+smx);
    }
}