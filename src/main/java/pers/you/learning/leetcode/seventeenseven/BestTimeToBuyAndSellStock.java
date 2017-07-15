package pers.you.learning.leetcode.seventeenseven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/*
 '''
 【网友实现】:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/solution
 LeetCode121. Best Time to Buy and Sell Stock
 Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Example 1:
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5

 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 Input: [7, 6, 4, 3, 1]
 Output: 0

 In this case, no transaction is done, i.e. max profit = 0.

 '''
 */


public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
           int maxprofit = 0;
           for (int i = 0; i < prices.length; i++) {
               if (prices[i] < minprice)
                   minprice = prices[i];
               else if (prices[i] - minprice > maxprofit)
                   maxprofit = prices[i] - minprice;
           }
           return maxprofit;
       }
}
