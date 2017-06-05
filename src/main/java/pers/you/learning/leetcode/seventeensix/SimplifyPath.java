package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode71. Simplify Path
Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"

Corner Cases:
Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
 */


import java.util.Collections;
import java.util.Stack;


public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] array = path.split("/");
        for (String i : array) {
            if (i.equals("") || i.equals(".")) {
                continue;
            } else {
                if (i.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(i);
                }
            }
        }
        if (stack.isEmpty()) {
            return "/";
        } else {
            StringBuilder sb = new StringBuilder();
            Collections.reverse(stack);
            while (!stack.isEmpty()) {
                sb.append("/").append(stack.pop());
            }

            return sb.toString();
        }
    }
}
