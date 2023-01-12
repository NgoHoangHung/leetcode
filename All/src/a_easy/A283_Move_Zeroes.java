package a_easy;

public class A283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] newArray = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                newArray[k++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = newArray[i];
        }
    }
}
