package Arrays;

public class  CopyOfArray{
    public static void main(String[] args) {
        int [] arr = {50,60, 20,35,70 , 30, 40};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int [] nums= arr;  // shallow copy
        nums[0] = 70;
        System.out.print(arr[0]);
//        for (int i = 0; i<nums.length;i++){
//            System.out.print(nums[i]+" ");
//        }

    }
}
