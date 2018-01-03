package pers.you.learning.leetcode.seventeentwelve;

import java.util.ArrayList;
import java.util.List;

/*
'''
【网友实现】:http://bookshadow.com/weblog/2017/12/17/leetcode-min-cost-climbing-stairs/
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

Example 1:
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
Example 2:
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
Note:
cost will have a length in the range [2, 1000].
Every cost[i] will be an integer in the range [0, 999].
'''
 */


public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        List<Integer> dp = new ArrayList<Integer>();
        dp.add(cost[0]);
        dp.add(cost[1]);
        for(int i = 2;i < size;i++){
            dp.add(Math.min(dp.get(i-1),dp.get(i-2))+cost[i]);
        }
        return Math.min(dp.get(dp.size()-1),dp.get(dp.size()-2));
    }
}
