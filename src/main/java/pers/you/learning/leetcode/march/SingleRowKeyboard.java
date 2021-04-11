package pers.you.learning.leetcode.march;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
LeetCode 1165. 单行键盘
我们定制了一款特殊的力扣键盘，所有的键都排列在一行上。

我们可以按从左到右的顺序，用一个长度为 26 的字符串 keyboard （索引从 0 开始，到 25 结束）来表示该键盘的键位布局。

现在需要测试这个键盘是否能够有效工作，那么我们就需要个机械手来测试这个键盘。

最初的时候，机械手位于左边起第一个键（也就是索引为 0 的键）的上方。当机械手移动到某一字符所在的键位时，就会在终端上输出该字符。

机械手从索引 i 移动到索引 j 所需要的时间是 |i - j|。

当前测试需要你使用机械手输出指定的单词 word，请你编写一个函数来计算机械手输出该单词所需的时间。

 

示例 1：

输入：keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
输出：4
解释：
机械手从 0 号键移动到 2 号键来输出 'c'，又移动到 1 号键来输出 'b'，接着移动到 0 号键来输出 'a'。
总用时 = 2 + 1 + 1 = 4. 
示例 2：

输入：keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode"
输出：73
 

提示：

keyboard.length == 26
keyboard 按某种特定顺序排列，并包含每个小写英文字母一次。
1 <= word.length <= 10^4
word[i] 是一个小写英文字母

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/single-row-keyboard
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SingleRowKeyboard {

	String keyboard = "pqrstuvwxyzabcdefghijklmno";
			
	String word = "leetcode";
	
	
	//Method One
    public int calculateTime1(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<Character,Integer>();
    	for(int i=0;i<keyboard.length();i++){
    		map.put(keyboard.charAt(i), i);
    	}
    	
    	int time = map.get(word.charAt(0));
        for(int i=0;i<word.length()-1;i++){
        	time+=Math.abs(map.get(word.charAt(i))-map.get(word.charAt(i+1)));
        }
        
        return time;
    }
//    Method Two
    public int calculateTime2(String keyboard, String word) {
    	char[] cw=word.toCharArray();
    	int index=0,time=0;
        for(char c:cw){
        	time+=Math.abs(keyboard.indexOf(c)-index);
        	index=keyboard.indexOf(c);
        }
        
        return time;
    }
    
    
	@Test
	public void test(){
		System.out.println(calculateTime2(keyboard, word));
	}
	
	
	
}
