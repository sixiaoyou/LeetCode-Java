package pers.you.learning.leetcode.seventeensix;
/*
【极客学院版】
LeetCode20-Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

import java.util.Stack;

import org.junit.Test;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() % 2 != 0) {
            return false;
        } else {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                default:
                    break;
                }

            }
            if (stack.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Test
    public void test() {
        isValid("()");

    }
}
