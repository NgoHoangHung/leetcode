package a_easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
public class A1480_RunningSumOf_1d_Array {
    public static void main(String[] args) {
        for (int  arg :runningSum(5)) {
            System.out.println(arg);
        }
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

    }
    public static int[] runningSum(int n) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Array of amount: ");

        int array[] = new int[n];
        System.out.println("Enter array of values: ");
        for (int i = 0; i < n; i++) {
            System.out.println("array["+i+"] = ");
            array[i] = parseInt(sc.nextLine());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += array[i];
            array[i] += count;
        }
        return array;
    }
}
