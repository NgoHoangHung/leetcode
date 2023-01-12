package a_easy;


/*
771. Jewels and Stones
Companies
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0

Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
 */
public class A771_Jewels_and_Stones {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            return 0;
        }
        int[] stonesArray = new int[123];
        for (int i = 0; i < stones.length(); i++) {
            stonesArray[stones.charAt(i)]++;
        }
        for (int i = 0; i < jewels.length(); i++) {
            if (stonesArray[jewels.charAt(i)] != 0) ;
            stonesArray[0] += stonesArray[jewels.charAt(i)];
        }
        return stonesArray[0];
    }

    public int numJewelsInStones1(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1)
                count++;
        }
        return count;
    }
}
