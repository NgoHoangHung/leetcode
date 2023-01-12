package a_easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
1678. Goal Parser Interpretation
You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Example 1:
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated tmpt is "Goal".

Example 2:
Input: command = "G()()()()(al)"
Output: "Gooooal"

Example 3:
Input: command = "(al)G(al)()()G"
Output: "alGalooG"

Constraints:
1 <= command.length <= 100
command consists of "G", "()", and/or "(al)" in some order.
 */
public class A1678_Goal_Parser_Interpretation {
    @Test
    public void unitTest() {
        //data
        String command = "G()(al)";
        Assertions.assertEquals("Goal", interpret1(command));
    }

    public String interpret(String command) {
        int n = command.length() - 1;
        StringBuilder tmp = new StringBuilder();
        while (n >= 0) {
            switch (command.charAt(n)) {
                case ')':
                    if (command.charAt(n - 1) == 'l')
                        tmp.append("la");
                    else
                        tmp.append("o");
                    n--;
                    break;
                case 'G':
                    tmp.append("G");
                    n--;
                    break;
                default:
                    n--;
                    break;
            }
        }
        String resul = tmp.reverse().toString();
        return resul;
    }

    public String interpret1(String command) {
        StringBuilder str = new StringBuilder();
        int leng = command.length();
        for (int i = 0; i < leng; i++) {
            if (command.charAt(i) != '(' && command.charAt(i) != ')') str.append(command.charAt(i));
            else if (command.charAt(i) == ')' && command.charAt(i - 1) == '(') str.append("o");
        }
        return str.toString();
    }
}
