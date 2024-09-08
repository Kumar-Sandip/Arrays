package Arrays;

public class RemoveDuplicateNum {
    public static int main(String[] args) {

        int nums[] = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
                System.out.println(nums[j]);
            }

        }
        return ++j;
    }
}

