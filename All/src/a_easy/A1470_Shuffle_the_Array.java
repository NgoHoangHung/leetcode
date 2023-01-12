package a_easy;

public class A1470_Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[2 * n];
        int index1 = 0;
        int index2 = n;
        for (int i = 0; i < newArray.length; i++) {
            if (i % 2 == 0) newArray[i] = nums[index1++];
            else newArray[i] = nums[index2++];
        }
        return newArray;
    }

    public int[] shuffle0ms(int[] nums, int n) {
        int i = 0, j = 0, k = n;
        int a[] = new int[2 * n];
        while (i < n) {
            a[j++] = nums[i++];
            a[j++] = nums[k++];
        }
        return a;
    }

    public int[] shuffle0mss(int[] nums, int n) {
        int[] newArray = new int[2 * n];
        for (int i = 0; i < n; i++) {
            newArray[2 * i] = nums[i];
            newArray[2 * i + 1] = nums[n + i];
        }
        return newArray;
    }
}
