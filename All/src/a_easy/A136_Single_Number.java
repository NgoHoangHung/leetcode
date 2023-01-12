package a_easy;

import java.util.HashMap;
import java.util.Map;

/*
136. Single Number
Easy
Companies
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
Accepted
1.9M
Submissions
2.8M
Acceptance Rate
70.1%
 */
public class A136_Single_Number {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int index = 0;
        Map<Integer, Integer> obj = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            obj.put(nums[i], obj.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : obj.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }

//    public int singleNumber4ms(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            nums[i] = 0 ^ nums[i];
//        }
//    }
}
