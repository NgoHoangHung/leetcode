package a_easy;

/*
344. Reverse String
Easy
Companies
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ['h','e','l','l','o']
Output: ['o','l','l','e','h']

Example 2:
Input: s = ['H','a','n','n','a','h']
Output: ['h','a','n','n','a','H']
Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A344_Reverse_String {

    @Test
    public void unitTest() {
        //data
//        char[] s1 = {'H','a','m','n','a','h'};
//        char[] m = {'h','a','n','m','a','H'};
//reverseString(s1);
//Assertions.assertArrayEquals(m,s1);
        char[] s = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};
        reverseString1(s);
//        char[] output1 = {'a', 'm', 'a', 'n', 'a', 'P', ' ', ':', 'l', 'a', 'n', 'a', 'c', ' ', ' ', 'a', ',', 'n', 'a', 'l', 'p', ' ', 'a', ' ', ',', 'n', 'a', 'm', ' ', 'A'};
        char[] output2 = {'a', 'm', 'a', 'n', 'a', 'P', ' ', ':', 'l', 'a', 'n', 'a', 'c', ' ', 'a', ' ', ',', 'n', 'a', 'l', 'p', ' ', 'a', ' ', ',', 'n', 'a', 'm', ' ', 'A'};
        Assertions.assertArrayEquals(output2, s);

        //        System.out.println(output1.length);
//        char[] output2 =    {'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'};
//        System.out.println(output2.length);
//        reverseString(s);
//        Assertions.assertArrayEquals(output2,output1);
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length / 2); i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
    public void reverseString1(char[] s){
        int startIndex = 0;
        int endIndex = s.length -1;
        while(startIndex<endIndex){
            char tmp = s[endIndex];
            s[endIndex] = s[startIndex];
            s[startIndex] = tmp;
            startIndex++;
            endIndex--;
        }

    }

}
