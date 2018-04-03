package pers.you.learning.leetcode.eighteen;

import java.util.Arrays;
import java.util.List;

/*
 *LeetCode788. Rotated Digits
X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.

A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.

Now given a positive number N, how many numbers X from 1 to N are good?

Example:
Input: 10
Output: 4
Explanation: 
There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 */

public class RotatedDigits {
    public int rotatedDigits(int N) {
        List<Character> l1 = Arrays.asList('2','5','6','9');
        List<Character> l2 = Arrays.asList('0','1','8');
        List<Character> l3 = Arrays.asList('3','4','7');
        int count = 0;
        for(int i = 1;i<=N;i++){
            int count1=0,count2 = 0;
            String si = String.valueOf(i);
            for(int j=0;j<si.length();j++){
                if(l3.contains(si.charAt(j))){
                    count1+=1;
                }else if(l1.contains(si.charAt(j))){
                    count2+=1;
                }
            }
            if(count2!=0&&count1==0){
                count+=1;
            }
        }
        return count;
            
    }
}
