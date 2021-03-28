package pers.you.learning.leetcode.march;

/*LeetCode-1119. 删去字符串中的元音
给你一个字符串 S，请你删去其中的所有元音字母（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
示例 1：

输入："leetcodeisacommunityforcoders"
输出："ltcdscmmntyfrcdrs"
示例 2：

输入："aeiou"
输出：""
 

提示：

S 仅由小写英文字母组成。
1 <= S.length <= 1000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-vowels-from-a-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * 
 */


import org.junit.Test;

public class RemoveVowelsFromAString {
	 public String removeVowels(String s) {
		 	String s1 = "aeiou";
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<s.length();i++){
	        	if(!s1.contains(String.valueOf(s.charAt(i)))){
	        		sb.append(s.charAt(i));
	        	}
	        }
	     
	        return sb.toString();
	    }
}
