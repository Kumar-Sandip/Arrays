package Arrays;

public class Rotate_array_02method {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 0, 1, 0};
        int n = arr.length;

int i = 0 , j = n-1;
while (i<j){
    if(arr[i]==0) i++;
  else   if(arr[j]==i) j--;

   else if (arr[i]==1 && arr[j]==0){
        arr[i] =0;
        arr[j] = 1;
        i++;
        j--;
    }
    for (int ele: arr) {
        System.out.print(ele + " ");
    }
    System.out.println();
}
    }
}

