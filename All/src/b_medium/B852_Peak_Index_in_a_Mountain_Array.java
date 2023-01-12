package b_medium;

/*
852. Peak Index in a Mountain Array
Medium
Companies
An array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
You must solve it in O(log(arr.length)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
 */
public class B852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        int[] arr1 = {0, 2, 1, 0};
        int[] arr2 = {0, 10, 5, 2};
        int[] arr3 = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};

        System.out.println(peakIndexInMountainArray1(arr));
        System.out.println(peakIndexInMountainArray1(arr1));
        System.out.println(peakIndexInMountainArray1(arr2));
        System.out.println(peakIndexInMountainArray1(arr3));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        int leng = arr.length;
        while (index < leng) {
            if (arr[index] < arr[index + 1]) {
                index++;
            } else return index;
        }
        return 0;
    }


    public static int peakIndexInMountainArray1(int[] arr) {
        int left = 0;
        int right = arr.length;
        int mid;
        while (left < right) {
             mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return right;
    }
}
