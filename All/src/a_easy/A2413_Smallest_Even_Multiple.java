package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A2413_Smallest_Even_Multiple {
    @Test
    public void unitTest() {
        //data
        Assertions.assertEquals(6, smallestEvenMultiple(6));
        Assertions.assertEquals(2, smallestEvenMultiple(2));
        Assertions.assertEquals(2, smallestEvenMultiple(1));
        Assertions.assertEquals(10, smallestEvenMultiple(5));
        Assertions.assertEquals(50, smallestEvenMultiple(25));
    }

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public int smallestEvenMultiple1(int n) {
        if (n == 1) return 2;
        else if (n % 2 == 0) return n;
        else if (n > 2) {
            int i = 2;
            while (i <= n / 2 && n % i == 0) {
                n /= i;
            }
            return 2 * n;
        }
        return n;
    }
}
