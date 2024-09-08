package Arrays;

public class MininArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 12, 13 ,23 ,20  ,34, 200};
        int  n = arr.length;
        int mx = Integer.MAX_VALUE;
        for (int i = 1; i<n;i++){
//            if (arr[i]>mx) mx = arr[i];
            mx = Math.min(mx ,arr[i]);
        }
        System.out.println("Minimum number is : "+mx);
    }
}

