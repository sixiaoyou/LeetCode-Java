package pers.you.learning.leetcode.march;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
	public int max(int[] candies){
        int m=0;
        for(Integer i:candies){
            m=Math.max(m,i);
        }
        return m;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b = new ArrayList<Boolean>();
        int m=max(candies);
        for(Integer i:candies){
            b.add(i+extraCandies>=m);
        }
        return b;
    }
}
