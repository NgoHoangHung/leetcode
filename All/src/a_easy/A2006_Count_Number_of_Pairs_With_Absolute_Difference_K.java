package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A2006_Count_Number_of_Pairs_With_Absolute_Difference_K {
    @Test
    public void unitTest(){
        //data
        int[] nums = {3,2,1,5,4};
        Assertions.assertEquals(3,countKDifference(nums,2));
    }
    public int countKDifference(int[] nums, int k) {
        int resul = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k)
                resul++;
            }
        }
        return resul;
    }
}
