package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A704_Binary_Search {
    @Test
    public void unitTest() {
        //data
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        Assertions.assertEquals(4, search(nums, 9));
    }

    public int search(int[] nums, int target) {
        int indexLeft = 0;
        int indexRight = nums.length - 1;

        while (indexLeft < indexRight) {
            int mid = (indexLeft + indexRight) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                indexRight = mid - 1;
            } else if (nums[mid] < target) {
                indexLeft = mid + 1;
            }
        }
        return -1;
    }

    @Test
    public void unitTest1() {
        //data
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        Assertions.assertEquals(2, search1(nums, 3));
        Assertions.assertEquals(-1, search1(nums, 2));
    }

    public int search1(int[] nums, int target) {
        int right = nums.length - 1;
        return searchBinary(nums, target, 0, right);
    }

    public int searchBinary(int[] nums, int target, int left, int right) {

        int mid = left + (right - left) / 2;

        if (left > right) return -1;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return searchBinary(nums, target, left, mid - 1);
        else if (nums[mid] < target) return searchBinary(nums, target, mid + 1, right);
        return -1;
    }
}
