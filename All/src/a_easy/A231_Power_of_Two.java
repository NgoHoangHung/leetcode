package a_easy;

/*
231. Power of Two
Easy
Companies
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:
Input: n = 3
Output: false

Constraints:
-231 <= n <= 231 - 1
 */
public class A231_Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(int n) {
    /*
        điều kiện dừng n =1;
    nếu chia 2 bị lẻ trả về false
    còn ko trả về true lần lượt
        */
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return n == 1;
        } else if (n >= 1 && n % 2 == 1)
            return false;
        return isPowerOfTwo(n / 2);
    }

    public static boolean isPowerOfTwo32ms(int n) {
        /*
        Điều kiện dừng
        n=0,n=1
        đệ quy trả về chuỗi true liên tiếp hay không. một false là sai hết
         */
        if (n == 0) return false;
        else if (n == 1) return true;
        return n % 2 == 0 && isPowerOfTwo(n / 2);
    }
}
