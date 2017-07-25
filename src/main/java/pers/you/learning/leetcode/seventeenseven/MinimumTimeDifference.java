package pers.you.learning.leetcode.seventeenseven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
'''
LeetCode539. Minimum Time Difference
Given a list of 24-hour clock time points in "Hour:Minutes" format, find the minimum minutes difference between any two time points in the list.

Example 1:
Input: ["23:59","00:00"]
Output: 1
Note:
The number of time points in the given list is at least 2 and won't exceed 20000.
The input time is legal and ranges from 00:00 to 23:59.
'''
 */

public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int minDiff = Integer.MAX_VALUE;
        List<Integer> convert = new ArrayList<Integer>();
        for(int i=0;i<timePoints.size();i++){
            int computeTemp = 0;
            String[] splitTemp = timePoints.get(i).split(":");
            computeTemp += Integer.parseInt(splitTemp[0])*60+Integer.parseInt(splitTemp[1]);
            if(Integer.parseInt(splitTemp[0])<12){
                convert.add(computeTemp+1440);
            }
            convert.add(computeTemp);
        }
        Collections.sort(convert);
        for(int i = 0;i<convert.size()-1;i++){
            minDiff = Math.min(convert.get(i+1)-convert.get(i),minDiff);
        }
        return minDiff;
    }
}
