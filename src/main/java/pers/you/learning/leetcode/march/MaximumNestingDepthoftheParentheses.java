package pers.you.learning.leetcode.march;

/*
LeetCode 1614. Maximum Nesting Depth of the Parentheses
A string is a valid parentheses string (denoted VPS) if it meets one of the following:

It is an empty string "", or a single character not equal to "(" or ")",
It can be written as AB (A concatenated with B), where A and B are VPS's, or
It can be written as (A), where A is a VPS.
We can similarly define the nesting depth depth(S) of any VPS S as follows:

depth("") = 0
depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

Given a VPS represented as string s, return the nesting depth of s.

 

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.
Example 2:

Input: s = "(1)+((2))+(((3)))"
Output: 3
Example 3:

Input: s = "1+(2*3)/(2-1)"
Output: 1
Example 4:

Input: s = "1"
Output: 0
 

Constraints:

1 <= s.length <= 100
s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
It is guaranteed that parentheses expression s is a VPS.
通过次数13,167提交次数16,010

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
	public int getMax(List<Integer> list){
		int max = 0;
		for(int i=0;i<list.size();i++){
			max=Math.max(max, list.get(i));
		}
		return max;
	}
	
	
	
	public int maxDepth(String s) {
		Stack<Character> stack = new Stack<>();
		List<Integer> list = new ArrayList<Integer>();
		for(char c:s.toCharArray()){
			if(c=='('){
				stack.push(c);
			}else if(c==')'){
				list.add(stack.size());
				stack.pop();
			}
		}
		return getMax(list);
    }
}
