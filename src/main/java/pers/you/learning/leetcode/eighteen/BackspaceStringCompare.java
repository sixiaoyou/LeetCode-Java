package pers.you.learning.leetcode.eighteen;

import java.util.Stack;

/*
LeetCode844. Backspace String Compare
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

 

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 

Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
 */

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
    Stack<Character> ls = new Stack<Character>();
    Stack<Character> lt = new Stack<Character>();
    for(int i = 0;i<S.length();i++){
        if(S.charAt(i)!='#'){
            ls.push(S.charAt(i));
        }else if(ls.size()!=0){
            ls.pop();
        }
    }
    for(int j = 0;j<T.length();j++){
        if(T.charAt(j)!='#'){
            lt.push(T.charAt(j));
        }else if(lt.size()!=0){
            lt.pop();
        }
    }
    return ls.equals(lt);
    }
}
