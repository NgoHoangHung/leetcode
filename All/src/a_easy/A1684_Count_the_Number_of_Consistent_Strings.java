package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A1684_Count_the_Number_of_Consistent_Strings {
    @Test
    public void unitTest() {
        //data
        String[] input = { "ad", "bd", "aaab", "baa", "badab" };
        Assertions.assertEquals(2, countConsistentStrings("ab", input));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int resul = 0;
        for (String word : words) {
            boolean flag = true;
            for (char c : word.toCharArray()) {
                if (!allowed.contains((c + " ").trim())) {
                    flag = false;
                    break;
                }
            }
            if (flag) resul++;
        }
        return resul;
    }
}
