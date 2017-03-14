/*
 网友实现：http://www.cnblogs.com/reboot329/p/5968393.html
LeetCode 424:Longest Repeating Character Replacement
Given a string that consists of only uppercase English letters, you can replace any letter in the string with another letter at most k times. Find the length of a longest substring containing all repeating letters you can get after performing the above operations.

Note:
Both the string's length and k will not exceed 104.

Example 1:

Input:
s = "ABAB", k = 2

Output:
4

Explanation:
Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input:
s = "AABABBA", k = 1

Output:
4

Explanation:
Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
 */




package pers.you.learning.leetcode.three;

public class LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
        if(s.length()==0) return 0;
		int res=0;
		int left=0;
		int[] array=new int[26];
		int most=++array[s.charAt(0)-'A'];
		for(int right=1;right<s.length();right++){
			most=Math.max(most, ++array[s.charAt(right)-'A']);
			if(right-left+1>most+k){
				array[s.charAt(left++)-'A']--;
			}
			else{
				res=Math.max(res, right-left+1);
			}
		}
		return res;
	}
}
