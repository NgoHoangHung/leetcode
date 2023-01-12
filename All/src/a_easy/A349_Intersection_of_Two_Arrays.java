package a_easy;

import java.util.ArrayList;
import java.util.List;

/*
349. Intersection of Two Arrays
Easy
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */
public class A349_Intersection_of_Two_Arrays {
    public static void main(String[] args) {

    }

    /*
    1, tạo mảng nhớ 1000 phần tử, khởi tạo biến nhớ cho mảng trả về với leng = newleng
    2 , khởi tạo 2 con trỏ, đếm phần tử trùng nhau theo mảng nhớ.
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] list = new int[1000];
        int newleng = 0; // tạo mảng mới
        int k = 0;
        while (k < nums1.length) {
            for (int i = 0; i < nums2.length; i++) {
                if (nums1[k] == nums2[i])
                    list[nums1[k]]++;
            }
            k++;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 1) newleng++;
        }
        int index = 0;
        int[] newarray = new int[newleng];
        for (int i = 0; i < 1000; i++) {
            if (list[i] > 0) {
                newarray[index] = i;
                index++;
            }
        }
        return newarray;
    }
}
