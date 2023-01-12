package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A392_Is_Subsequence {
    @Test
    public void unitTest() {
        //data
        Assertions.assertEquals(true,isSubsequence("abc","ahbgdc"));
        Assertions.assertEquals(false,isSubsequence("axc","ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) return false;
        int subIndex = 0;
        int superIndex = 0;
        while (subIndex < s.length() && superIndex < t.length()) {
            if (t.charAt(superIndex) == s.charAt(subIndex)) {
                subIndex++;
            }
            superIndex++;
        }
        if (subIndex < s.length()) return false;
        return true;
    }
}
/*
392. Is Subsequence
Easy
6.4K
356
Companies
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.


Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109,
and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 */