package b_medium;

import org.junit.jupiter.api.Test;

public class B189_Rotate_Array {
    @Test
    public void unitTest() {
        //data
        int[] nums = { -1 };
        rotate(nums, 2);
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==1) return;
        if(n<=k) k%=n;
        int[] newArray = new int[n];
        int index = n - k;
//        if (index < 0) return;
        for (int i = 0; i < n; i++) {
            if (i < k)
                newArray[i] = nums[index++];
            else if (i >= k)
                newArray[i] = nums[i - k];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = newArray[i];

        }
    }
}
