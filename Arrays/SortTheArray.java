package Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,1,0,0,0,1,0};
        int n = arr.length;
        int noofzeroes =0;
        for (int i  = 0 ; i<n;i++){
            if (arr[i]==0) noofzeroes++;
        }
        for (int i = 0;i<n;i++){
          if (i<noofzeroes) arr[i] = 0;
          else arr[i]= 1;
            System.out.print(arr[i]+" ");
        }
      ;
    }
}
