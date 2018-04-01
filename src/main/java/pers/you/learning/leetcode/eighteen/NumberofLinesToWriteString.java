package pers.you.learning.leetcode.eighteen;

import java.util.HashMap;
import java.util.Map;

/*
'''
【网友实现】https://blog.csdn.net/a529975125/article/details/79686619
We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.



Example :
Input:
widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "abcdefghijklmnopqrstuvwxyz"
Output: [3, 60]
Explanation:
All letters have the same length of 10. To write all 26 letters,
we need two full lines and one line with 60 units.
Example :
Input:
widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "bbbcccdddaaa"
Output: [2, 4]
Explanation:
All letters except 'a' have the same length of 10, and
"bbbcccdddaa" will cover 9 * 10 + 2 * 4 = 98 units.
For the last 'a', it is written on the second line because
there is only 2 units left in the first line.
So the answer is 2 lines, plus 4 units in the second line.


Note:

The length of S will be in the range [1, 1000].
S will only contain lowercase letters.
widths is an array of length 26.
widths[i] will be in the range of [2, 10].

'''
 */

public class NumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int sum = 0;
        int lastLine = 1;
        int lastValue = 0;
        int[] returnArray=new int[2];
        Character[] a={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],widths[i]);
        }
        for(int j=0;j<S.length();j++){
            if(sum+map.get(S.charAt(j))<=100){
                sum+=map.get(S.charAt(j));
            }else{
                lastLine+=1;
                sum=map.get(S.charAt(j));
            }
            lastValue=sum;
        }
        returnArray[0]=lastLine;
        returnArray[1]=lastValue;
        return returnArray;
    }
}
