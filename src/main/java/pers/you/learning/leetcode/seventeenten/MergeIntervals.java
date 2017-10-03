package pers.you.learning.leetcode.seventeenten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;

            }
        });
        List<Interval> res = new ArrayList<Interval>();
        for (int i = 0; i < intervals.size(); i++) {
            if (res.size() == 0) {
                res.add(intervals.get(0));
            }
            Interval end = res.get(res.size() - 1);
            if (end.end >= intervals.get(i).start) {
                end.end = Math.max(end.end, intervals.get(i).end);
            } else {
                res.add(intervals.get(i));
            }
        }
        return res;
    }
}
