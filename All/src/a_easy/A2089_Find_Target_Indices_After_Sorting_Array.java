package a_easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
2089. Find Target Indices After Sorting Array
Easy
Companies
You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in non-decreasing order.
If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

Example 1:
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

Example 2:
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.

Example 3:
Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

Constraints:
1 <= nums.length <= 100
1 <= nums[i], target <= 100
 */
public class A2089_Find_Target_Indices_After_Sorting_Array {
    public static void main(String[] args) {

    }

    public static int withloop(int[] array, int argument) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        int left = 0;
        int right = array.length - 1;
        while (left < right && left != right) {
            int mid = left + (right - left) / 2;
            if (array[left] == argument) return left;
            if (array[right] == argument) return right;
            if (array[mid] == argument) {
                return mid;
            } else if (array[mid] < argument)
                left = mid;
            else
                right = mid;
        }
        System.out.print("Vị trí cuả phần tử cần tìm là: ");
        return -1;
    }
/*
1, sắp xếp lại mảng
2,cho duyệt mảng, phần tử nào trùng với target thì thêm  index vào list
 */
    public List<Integer> targetIndices1(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                list.add(i);
        }
        return list;
    }
}
