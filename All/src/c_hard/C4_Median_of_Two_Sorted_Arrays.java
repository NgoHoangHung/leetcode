package c_hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class C4_Median_of_Two_Sorted_Arrays {
    @Test
    public void unitTest() {
        //data
        int[] a1 = {1, 3};
        int[] b1 = {2};
        int[] a2 = {1, 2};
        int[] b2 = {3, 4};
        int[] a3 = {1, 3};
        int[] b3 = {2, 7};
        int[] a4 = {2, 2, 4, 4};
        int[] b4 = {2, 2, 4, 4};

        Assertions.assertEquals(2.5, findMedianSortedArrays(a3, b3));
        Assertions.assertEquals(2.5, findMedianSortedArrays(a2, b2));
        Assertions.assertEquals(3.0, findMedianSortedArrays(a4, b4));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int indexNum1 = 0;
        int indexNum2 = 0;
        int Size = (m + n);
        int[] newArray = new int[Size];
        for (int i = 0; i < Size; i++) {
            if (indexNum1 == m) {
                newArray[i] = nums2[indexNum2];
                indexNum2++;
            } else if (indexNum2 == n) {
                newArray[i] = nums1[indexNum1];
                indexNum1++;
            } else if (nums1[indexNum1] <= nums2[indexNum2]) {
                newArray[i] = nums1[indexNum1++];

            } else if (nums1[indexNum1] > nums2[indexNum2]) {
                newArray[i] = nums2[indexNum2++];
            }
        }
        return (m + n) % 2 == 1 ? newArray[Size/2] : (double) (newArray[Size/2] + newArray[Size/2 - 1]) / 2;
    }
}