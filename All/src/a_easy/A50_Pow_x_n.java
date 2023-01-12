package a_easy;

/*
50. Pow(x, n)
Medium
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

Constraints:
-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
-104 <= xn <= 104
 */
public class A50_Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
//        System.out.println(myPow(0.00001, -10));
//        System.out.println(myPow(0.00001, 27));
//        System.out.println(myPow(0.00001, 7));
//        System.out.println(myPow(0.00001, -50));
    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 1)
            return x * myPow(x, n - 1);
        else if (n % 2 == 0)
            return myPow(x * x, n / 2);
        return 1 / myPow(x, -n);
    }
}
