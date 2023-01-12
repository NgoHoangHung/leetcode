package a_easy;

/*
557. Reverse Words in a String III
Companies
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"

Constraints:
1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 */
public class A557_Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String resul = "";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                resul += str[i].charAt(j);
            }
            resul += " ";
        }
        return resul.trim();
    }

    //bài tham khảo |
    //              V
    public String reverseWords6ms(String s) {
        byte[] bytes = s.getBytes();
        int left = 0;
        int right;

        for (int i = 0; i < bytes.length; i++) {

            if (bytes[i] == 32 || i == bytes.length - 1) {
                right = i == bytes.length - 1 ? i : i - 1;

                while (left < right) {
                    byte temp = bytes[left];
                    bytes[left] = bytes[right];
                    bytes[right] = temp;
                    left++;
                    right--;
                }

                left = i + 1;
            }
        }

        return new String(bytes);
    }


    public static String revers(String k) {
        char[] s = k.toCharArray();
        int e = s.length - 1, start = 0;
        while (start < e) {
            char temp = s[start];
            s[start] = s[e];
            s[e] = temp;
            start++;
            e--;
        }
        return new String(s);

    }

    public String reverseWords15ms(String s) {
        String[] bef = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int m = bef.length - 1;
        for (int i = 0; i < m; i++) {
            sb.append(revers(bef[i]) + " ");
        }
        sb.append(revers(bef[m]));
        return sb.toString();
    }

}
