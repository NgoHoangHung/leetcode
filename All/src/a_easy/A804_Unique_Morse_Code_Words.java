package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/*
804. Unique Morse Code Words
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

Example 1:
Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".

Example 2:
Input: words = ["a"]
Output: 1

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 12
words[i] consists of lowercase English letters.
 */
public class A804_Unique_Morse_Code_Words {
    @Test
    public void unitTest() {
        //data
        String[] input1 = { "gin", "zen", "gig", "msg" };
        String[] input2 = { "rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn" };
        String[] input3 = { "yxmine", "yxzd", "eljys", "uiaopi", "pwlk" };

//        Assertions.assertEquals(2, uniqueMorseRepresentations(input1));
//        Assertions.assertEquals(1, uniqueMorseRepresentations(input2));
        Assertions.assertEquals(3, uniqueMorseRepresentations(input3));
    }

    public int uniqueMorseRepresentations(String[] words) {
        int inputLength = words.length;
        if (inputLength == 1) return 1;
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
//        StringBuilder[] encode = new StringBuilder[inputLength];
        Set<String> obj = new HashSet<>();
        for (int i = 0; i < inputLength; i++) {
            String tmp = "";
            char[] clipboard = words[i].toCharArray();
            for (char c : clipboard) {
                tmp+=morseCode[c - 97];
            }
            obj.add(tmp);
//            encode[i] = tmp;
        }
        return obj.size();
//        Arrays.sort(encode);
//        int index = 0;
//        while (index < inputLength - 1) {
//            boolean flag = true;
//            int indexTmp = index;
//            for (int j = index + 1; j < inputLength; j++) {
//                if (encode[index].compareTo(encode[j]) == 0) {
//                    if (flag) {
//                        result++;
//                        flag = false;
//                    } else {
//                        indexTmp = j;
//                    }
//                }
//            }
//            if (index != indexTmp) {
//                index = indexTmp + 1;
//            } else {
//                index++;
//            }
//        }
//        return result;
    }
}
