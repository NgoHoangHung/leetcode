package ngohoanghung.assignment4.leetcode;

/*
326. Power of Three
Easy
Companies
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:
Input: n = 27
Output: true
Explanation: 27 = 33

Example 2:
Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.

Example 3:
Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

Constraints:
-231 <= n <= 231 - 1

 */
public class A326_Power_of_Three {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(83));
    }

    public static boolean isPowerOfThree(int n) {

        if (n == 0) return false;
        else if (n == 1) return true;
            return n % 3 == 0 && isPowerOfThree(n / 3);
    }

    public static int checkDividerThree(int n) {
        int resul = 0;
        do {
            resul += n % 10;
            n /= 10;
        } while (n / 10 >= 1);
        return resul;
    }
}
