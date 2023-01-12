package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
9. Palindrome Number
Easy
Companies
Given an integer x, return true if x is a
palindrome
, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1
Follow up: Could you solve it without converting the integer to a string?
 */
public class A9_Palindrome_Number {
    @Test
    public void unitTest() {
//data
        int input = 123321;
        int input1 = 1001;
        Assertions.assertEquals(true, isPalindrome(input1));
    }

    public static void main(String[] args) {
        A9_Palindrome_Number obj = new A9_Palindrome_Number();
        boolean b = obj.isPalindrome(1001);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int tmp = x;
        int resul = 0;
        while (tmp >= 1) {
            if (tmp >= 10)
                resul = (tmp % 10 + resul) * 10;

            if (tmp < 10)
                resul += tmp;
            tmp /= 10;
        }
        System.out.println(resul);

        if (x == resul) return true;
        return false;
    }
}
