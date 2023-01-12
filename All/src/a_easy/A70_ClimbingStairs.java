package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A70_ClimbingStairs {
    @Test
    public void UnitTest() {
        var resul = climbStairs(5);
        Assertions.assertEquals(8, resul);
        var resul1 = climbStairs(45);
        Assertions.assertEquals(1836311903, resul1);

    }


    public static void main(String[] args) {
        A70_ClimbingStairs obj = new A70_ClimbingStairs();
        System.out.println(obj.climbStairs(45));
    }

    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] += arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
