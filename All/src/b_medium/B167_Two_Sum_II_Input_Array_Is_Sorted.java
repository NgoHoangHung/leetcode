package b_medium;

import java.util.HashMap;
import java.util.Map;

public class B167_Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < 0 && numbers[i + 1] < 0 && target > 0) continue;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{ i, j };
            }
        }
        return null;
    }

    /*
    Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     */
    public int[] twoSum1(int[] numbers, int target) {
        Map<Integer, Integer> obj = new HashMap<>();
        return null;
    }

    /**
     * 2. Map. O(n), O(n)
     * 建立[ele:index]的map. 循环每个ele,如果target-ele在map中,则返回当前index和(target-ele)在map中的index;
     * 否则,将当前ele和对应的index加入map中
     */
    public int[] twoSum3(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[2];
        }

        // key: ele; val: index + 1(added by one as an integer array)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{ map.get(target - numbers[i]), i + 1 };
            }

            map.put(numbers[i], i + 1);
        }

        return new int[2];
    }

    /**
     * 1. two pointer. O(n), O(1)
     * 分别从两端向中间移动,如果两边的和大于target,则右index向左移动...
     */
    public int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[2];
        }

        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{ left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[2];
    }
}
