package a_easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
