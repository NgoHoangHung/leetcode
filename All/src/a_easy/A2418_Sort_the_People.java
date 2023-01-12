package a_easy;


import java.util.*;

/*
2418. Sort the People
Easy
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights.

Example 1:
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.

Example 2:
Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.

Constraints:
n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */
public class A2418_Sort_the_People {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        for (String peple : sortPeople(names, heights)) {
            System.out.println(peple);
        }
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int[] copyheights = new int[heights.length];
        for (int i = 0; i < copyheights.length; i++) {
            copyheights[i] = heights[i];

        }
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int tmp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tmp;
                }
            }
        }
        String[] newNames = new String[names.length];
        for (int i = 0; i < newNames.length; i++) {
            for (int j = 0; j < newNames.length; j++) {
                if (copyheights[j] == heights[i]) {
                    newNames[i] = names[j];
                    break;
                }
            }
        }
        for (int height : copyheights) {
            System.out.println(height);
        }
        return newNames;
    }
}


















