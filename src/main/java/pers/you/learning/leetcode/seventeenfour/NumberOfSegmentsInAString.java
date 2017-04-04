/*
LeetCode434:Number of Segments in a String
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
 */

package pers.you.learning.leetcode.seventeenfour;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NumberOfSegmentsInAString {

    // 网友实现：https://discuss.leetcode.com/topic/70642/clean-java-solution-o-n
    public int countSegmentsV1(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                res++;
            }
        }
        return res;
    }

    public int countSegmentsV2(String s) {
        Set<String> setS = new HashSet<String>();
        List<String> listS = new ArrayList<String>();
        String[] arrayS = s.split(" ");
        int count = 0;
        for (String i : arrayS) {
            if (i.equals("")) {
                count++;
            }
            setS.add(i);
        }
        for (String string : setS) {
            listS.add(string);
        }
        if (listS.isEmpty()) {
            return 0;
        } else {
            return arrayS.length - count;
        }
    }
}
