package a_easy;

/*
1827. Minimum Operations to Make the Array Increasing
Easy
Companies
You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.
For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
Return the minimum number of operations needed to make nums strictly increasing.
An array nums is strictly increasing if nums[i] < nums[i+1] for all 0 <= i < nums.length - 1.
An array of length 1 is trivially strictly increasing.

Example 1:
Input: nums = [1,1,1]
Output: 3
Explanation: You can do the following operations:
1) Increment nums[2], so nums becomes [1,1,2].
2) Increment nums[1], so nums becomes [1,2,2].
3) Increment nums[2], so nums becomes [1,2,3].

Example 2:
Input: nums = [1,5,2,4,1]
Output: 14

Example 3:
Input: nums = [8]
Output: 0

Constraints:
1 <= nums.length <= 5000
1 <= nums[i] <= 104
 */
public class A1827_Minimum_Operations_to_Make_the_Array_Increasing {
    public static void main(String[] args) {
        System.out.println(
                minOperations19ms(new int[]{1, 5, 2, 4, 1}));
    }

    /*
    1, duyệt chuỗi
    2,arg[1] > arg[2] k bặc thì arg[2] = args+1;
    3, Đầu ra output gán += args[1] - args[2] + 1
     */
    public static int minOperations19ms(int[] nums) {
        int countOutput = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if (nums[i] >= nums[j]) {
                countOutput += nums[i] - nums[j] + 1;
                nums[j] = nums[i] + 1;
            }
        }
        return countOutput;
    }

    public int minOperations4ms(int[] nums) {
        int cnt = 0;
        for (int i = 1, p = nums[0]; i < nums.length; ++i) {
            if (nums[i] > p) {
                p = nums[i];
            } else {
                ++p;
                cnt += p - nums[i];
            }
        }
        return cnt;
    }
}
