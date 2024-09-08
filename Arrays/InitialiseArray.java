package Arrays;

public class InitialiseArray {
    public static void main(String[] args) {
        int []arr = {10, 20 , 40, 50, 60, 70,80};//Declaration................
        //System.out.println(arr[3]);
        // Taking Output by using Loops
        int n= arr.length;
        System.out.println(n);
        for (int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
