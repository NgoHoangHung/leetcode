package a_easy;

public class A342_Power_of_Four {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(17));
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;
        return n % 4 == 0 && isPowerOfFour(n / 4);
    }
}
