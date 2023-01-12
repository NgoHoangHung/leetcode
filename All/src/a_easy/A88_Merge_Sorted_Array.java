package a_easy;

import java.util.Arrays;

public class A88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n > 0) {
            for (int i = m ; i < nums1.length; i++) {
                nums1[i] = nums2[nums1.length-i];
            }
        }
        Arrays.sort(nums1);
    }
}
