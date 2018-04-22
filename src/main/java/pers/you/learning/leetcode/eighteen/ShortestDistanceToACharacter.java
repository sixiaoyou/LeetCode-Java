package pers.you.learning.leetcode.eighteen;

/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
 */

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String S, char C) {

        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                res[i] = 0;
            } else {
                int start = i, end = i, count1 = 0, count2 = 0;
                while (start > 0 && S.charAt(start) != C) {
                    start--;
                    count1 += 1;
                }
                while (end < S.length() - 1 && S.charAt(end) != C) {
                    end++;
                    count2 += 1;
                }
                if (S.charAt(start) != C && S.charAt(end) == C) {
                    res[i] = count2;
                } else if (S.charAt(end) != C && S.charAt(start) == C) {
                    res[i] = count1;
                } else {
                    res[i] = Math.min(count1, count2);
                }

            }

        }

        return res;

    }

}
