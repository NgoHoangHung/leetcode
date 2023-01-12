package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/*
20. Valid Parentheses
Easy
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.
An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class A20_Valid_Parentheses {
    @Test
    public void unitTest() {
        //data
        String input = "()[]{}";
        Assertions.assertEquals(true, isValid(input));

        String input1 = "]";
        Assertions.assertEquals(false, isValid(input1));
    }

    public boolean isValid(String s) {
        Stack<Character> stackObj = new Stack<>();
        char[] stackChar = s.toCharArray();
        int k = 0;//được coi như là số lượng phần tử trong stack. nếu gặp đóng ngoặc thì trừ, mở ngoặc thì cộng
        for (int i = 0; i < stackChar.length; i++) {
            switch (stackChar[i]) {
                case '(': {
                    k++;
                    stackObj.push('(');
                    break;
                }
                case '[': {
                    k++;
                    stackObj.push('[');
                    break;
                }
                case '{': {
                    k++;
                    stackObj.push('{');
                    break;
                }
                case ')': {
                    k--;
                    if (k < 0 || stackObj.pop() != '(') {
                        return false;
                    }
                    break;
                }
                case '}': {
                    k--;
                    if (k < 0 || stackObj.pop() != '{') {
                        return false;
                    }
                    break;
                }
                case ']': {
                    k--;
                    if (k < 0 || stackObj.pop() != '[') {
                        return false;
                    }
                    break;
                }
                default:
                    break;
            }

        }
        return stackObj.isEmpty();
    }
}
