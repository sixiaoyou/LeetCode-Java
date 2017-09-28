package pers.you.learning.leetcode.seventeennine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
'''
LeetCode681. Next Closest Time
Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. There is no limit on how many times a digit can be reused.

You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.

Example 1:

Input: "19:34"
Output: "19:39"
Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later.  It is not 19:33, because this occurs 23 hours and 59 minutes later.
Example 2:

Input: "23:59"
Output: "22:22"
Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22. It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
'''
 */



public class NextClosestTime {
    public int getIndex(int j, List<Integer> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == j) {
                index = i;
            }
        }
        return index;
    }

    public String nextClosestTime(String time) {
        int length = time.length() - 1;
        char[] cs = time.toCharArray();
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i <= length; i++) {
            if (cs[i] != ':') {
                ls.add(Integer.parseInt(String.valueOf(cs[i])));
            }
        }
        Collections.sort(ls);
        int temp1 = getIndex(Integer.parseInt(String.valueOf(cs[4])), ls);
        if (temp1 != 3) {
            cs[4] = (char) (ls.get(temp1 + 1) + 48);
            return String.valueOf(cs);
        } else {
            cs[4] = (char) (ls.get(0) + 48);
            int temp2 = getIndex(Integer.parseInt(String.valueOf(cs[3])), ls);
            if (temp2 != 3 && ls.get(temp2 + 1) < 6) {
                cs[3] = (char) (ls.get(temp2 + 1) + 48);
                return String.valueOf(cs);
            } else {
                int n = Integer.parseInt(String.valueOf(cs[1]));
                cs[3] = (char) (ls.get(0) + 48);
                int temp3 = getIndex(n, ls);
                if (temp3 != 3) {
                    if (cs[0] != '2' || ls.get(temp3 + 1) < 5) {
                        cs[1] = (char) (ls.get(temp3 + 1) + 48);
                        return String.valueOf(cs);
                    }
                }
                cs[1] = (char) (ls.get(0) + 48);
                if (Integer.parseInt(String.valueOf(cs[0])) < n && n < 3) {
                    cs[0] = cs[1];
                }
                return String.valueOf(cs);
            }

        }
    }

}
