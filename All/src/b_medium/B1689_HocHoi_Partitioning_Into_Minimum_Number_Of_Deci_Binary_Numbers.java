package b_medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class B1689_HocHoi_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers {
    @Test
    public void unitTest() {
        //data
        Assertions.assertEquals(3, minPartitions("32"));
        Assertions.assertEquals(8, minPartitions("82734"));
        Assertions.assertEquals(9, minPartitions("27346209830709182346"));
        Assertions.assertEquals(4, minPartitions("34"));
        Assertions.assertEquals(6, minPartitions("46"));
    }

    public int minPartitions(String n) {
        char tmp = '0';
        for (char c : n.toCharArray()) {
            if (c > tmp) tmp = c;
        }
        return tmp - '0';
    }

    public int minPartitions3ms(String n) {
        for (char i = '9'; i >= '0'; i--) {
            if (n.indexOf(i) != -1) {
                return i - '0';
            }
        }
        return 0;
    }

    public int minPartitions3mss(String n) {
        char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        int[] intNums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = nums.length - 1; i >= 0; i--) {
            if (n.indexOf(nums[i]) > -1) {
                return intNums[i];
            }
        }
        return -1;
    }

    public int minPartitions6ms(String n) {
        return "98765432".chars().filter(c -> n.indexOf(c) >= 0).findFirst().orElse('1') - '0';
    }
}
