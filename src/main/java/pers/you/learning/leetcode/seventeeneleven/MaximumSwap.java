package pers.you.learning.leetcode.seventeeneleven;

/*
LeetCode670. Maximum Swap
Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. Return the maximum valued number you could get.

Example 1:
Input: 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:
Input: 9973
Output: 9973
Explanation: No swap.
Note:
The given number is in the range [0, 108]
 */
import java.util.Arrays;

public class MaximumSwap {
    public int maximumSwap(int num) {
        int mark = -1;
        Boolean mark2=true;
        char[] charS = String.valueOf(num).toCharArray();
        int[] l1 = new int[charS.length];
        int[] l2 = new int[charS.length];
        for(int i = 0;i<charS.length;i++){
            l1[i] = Integer.valueOf(charS[i])-48;
            l2[i] = Integer.valueOf(charS[i])-48;
        }
        Arrays.sort(l2);
        Character temp = 'a';
        Character temp1 = 'a';
        for(int i=0;i<charS.length;i++){
            if(mark2&&l2[charS.length-i-1]>l1[i]){
                charS[i]=(char)(l2[charS.length-i-1]+48);
                temp = (char)(l1[i]+48);
                temp1 = (char)(l2[charS.length-i-1]+48);
                mark2=false;
            }
            if((char)(l1[i]+48) == temp1){
                mark = i;
            }
        }
        if(mark>0){
            charS[mark] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(Character c:charS){
            sb.append(String.valueOf(c));
        }
        return Integer.valueOf(sb.toString());  
        
    }
}
