package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A680_Valid_Palindrome_II {
//    @Test
//    public void unitTest() {
        //data
//        Assertions.assertEquals(true, validPalindrome("aba"));
//        Assertions.assertEquals(true, validPalindrome("abca"));
//        Assertions.assertEquals(true, validPalindrome("acbshbca"));
//        Assertions.assertEquals(false, validPalindrome("aaaaaaaaaaaacbcfasdsaddsfsda"));
//        Assertions.assertEquals(false, validPalindrome("deeee"));

//    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length();
        if (j == 1) return true;
        else if ((j == 2 || j == 3 || j == 4) && s.charAt(0) == s.charAt(j - 1)) return true;
        else if ((j == 2 || j == 3 || j == 4) && s.charAt(0) != s.charAt(j - 1)) return false;
        else {
            int mid = s.length() / 2;
            j--;
            if (s.charAt(0) != s.charAt(j - 1)) return false;
            while (i < mid - 1 && j > mid) {
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                } else return false;
            }
        }
        return true;
    }
}
