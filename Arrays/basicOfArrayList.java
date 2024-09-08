package Arrays;
import java.util.ArrayList;
public class basicOfArrayList {
    public static void main(String[] args) {
        // int [] arr = {1,2,3};
        //double [] brr = {3,12,3,1,2,3,2223};
        ArrayList<Integer> arr  = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,40);
        arr.add(2,50);
        arr.add(3,60);
        arr.add(4,70);
        arr.add(5,80);
       System.out.println(arr.size());
        for (int i = 0 ;  i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(2, 300);// using for set change the value.......or modify the value
        for (int i = 0 ;  i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        arr.add(90);
        System.out.println();
        System.out.println(arr.size());
        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");// arr[i]
        }

    }
}
