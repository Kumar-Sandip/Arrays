package Arrays;

public class SortZer_one_Two_orColor_code {
   public static void Sort01(int arr[]){
       int i=0; int j=arr.length;
       while (i<j){
           if (arr[i]==1 && arr[j]==0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j++;
           }
       }
   }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 1, 0,1, 0};
//        int n = arr.length;
//        int noofzeroes = 0, noofone = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) noofzeroes++;
//            if (arr[i] == 1) noofone++;
//
//        }
//        for (int i = 0; i < n; i++) {
//            if (i<noofzeroes) arr[i]=0;
//            else if (i<noofzeroes+noofone) arr[i] = 1;
//
//            else arr[i] =2;
//        int mid = 0, hi = n-1, lo = 0;
//        while (mid<=hi){
//            if (arr[mid]==0){
//                int temp = arr[mid] ;
//                arr[mid]=arr[lo];
//                arr[lo] = temp;
//                lo++; mid++;
//
//            }
//            else if (arr[mid]==1) mid++;
//            else {//arr[mid] ==2
//                int temp = arr[mid] ;
//                arr[mid]= arr[hi];
//                arr[hi] = temp;
//                hi--;
//            }
//
//        }
//
//
//        // Method-2: Dutch Flag Algorithm.........
//       for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
           Sort01(arr);
        for (int i = 0; i <arr.length-1; i++) {
            System.out.print(arr[i]);
        }
   }
}