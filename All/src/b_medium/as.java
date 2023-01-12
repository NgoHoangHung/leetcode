package b_medium;

import org.junit.jupiter.api.Test;

public class as {
    @Test
    public void unitTest() {
        int i = 1;
        int count = 0;
        while (i <= 4) {
            if (i == 1) {
                System.out.println(i);
                ++i;
            } else if (i == 2) {
                System.out.println(i);
                ++i;
            } else if (i == 3) {
                System.out.println(i);
                ++i;
            } else if (i == 4) {
                System.out.println(i);
                ++i;
            }
            count++;
        }
        System.out.println(count);
    }
}
