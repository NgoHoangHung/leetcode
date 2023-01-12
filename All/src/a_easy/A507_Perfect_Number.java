package a_easy;

import org.junit.jupiter.api.Test;

public class A507_Perfect_Number {
    @Test
    public void unitTest() {
//        int input = 1;
//        for (int i = 1; i <= 1; i++) {
//            if (checkPerfectNumber(i)) System.out.println(i);
//        }
        System.out.println(checkPerfectNumber(1));
    }
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) sum += num / i;
            }
        }
        return sum - num == num;
    }
}
