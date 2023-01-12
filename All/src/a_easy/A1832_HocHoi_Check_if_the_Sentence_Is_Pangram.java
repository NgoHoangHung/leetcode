package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class A1832_HocHoi_Check_if_the_Sentence_Is_Pangram {
    @Test
    public void unitTest() {
        //data
        Assertions.assertEquals(true, checkIfPangram(
                "thequickbrownfoxjumpsoverthelazydog"));
    }

    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(c);
        }
        for (Character character : sentence.toCharArray()) {
            if (set.contains(character)) set.remove(character);
        }

        return set.size() == 0 ? true : false;
    }

    public boolean checkIfPangram0ms(String sentence) {
        if (sentence.length() < 26) return false;
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) < 0) return false;
        }
        return true;
    }
}
