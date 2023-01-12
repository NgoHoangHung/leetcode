package a_easy;


import java.util.Arrays;

/*
1464. Maximum Product of Two Elements in an Array
Easy
Companies
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

Example 1:
Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.

Example 2:
Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.

Example 3:
Input: nums = [3,7]
Output: 12

Constraints:
2 <= nums.length <= 500
1 <= nums[i] <= 10^3
 */
public class A1464_Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
    }

    public static int maxProduct2(int[] nums) {
/*
 Thuật toán đuổi nhau: nếu phần tử trong mảng lớn hơn max1 thì gán cho max1.
  lưu lại giá trị max1 tại thời điểm này để lưu vết là số lớn thứ 2.
  các trường hợp tiếp theo là nums[i] <= max1 mà nums[i] lần này lại lớn hơn max2 thì gán giá trị ấy cho max 2
 */

        if (nums.length == 2 && nums[0] + nums[1] >= 1) {
            return (nums[0] - 1) * (nums[1] - 1);
        }
        int max1 = 0, max2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else {
                if (nums[i] > max2)
                    max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
