package Arrays;

import java.util.Scanner;

public class Print_OutpuOfArrays_02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
       int [] arr = new int[n];//Declaration................
//        arr [0] = 10;
//        arr [1] = 20;
//        arr [2] = 30;
//        arr [4] = 40;
//        arr [5] = -50;
//        arr [6] = 60;
//
//
////for output taking a loop
//        for (int i = 0; i<=6;i++){
//            System.out.print(arr[i]+" ");
//        }
        for (int i = 0; i<=n-1;i++) {
            arr[i]  = sc.nextInt();
        }
        for (int i = 0; i<=n-1;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
