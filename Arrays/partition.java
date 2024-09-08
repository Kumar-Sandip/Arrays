package Arrays;


import java.util.Arrays;

public class partition {
    public static int arrayPairSum(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        int maxSum = 0;

        // Step 2: Sum up the minimums of each pair
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int result = arrayPairSum(nums);
        System.out.println("The maximized sum is: " + result);  // Output should be 4
    }
}
