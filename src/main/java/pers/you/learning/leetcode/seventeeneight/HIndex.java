package pers.you.learning.leetcode.seventeeneight;

import java.util.Arrays;

/*
'''
LeetCode274. H-Index
Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

For example, given citations = [3, 0, 6, 1, 5], which means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively. Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, his h-index is 3.

Note: If there are several possible values for h, the maximum one is taken as the h-index.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
'''
*/

public class HIndex {
    // 【网友实现】:http://bookshadow.com/weblog/2015/09/03/leetcode-h-index/
    public int hIndexV1(int[] citations) {
        int N = citations.length;
        int[] cnts = new int[N + 1];
        for (Integer i : citations) {
            if (i > N) {
                cnts[N] += 1;
            } else {
                cnts[i] += 1;
            }
        }
        int sums = 0;
        for (int i = N; i > 0; i--) {
            if (cnts[i] + sums >= i) {
                return i;
            }
            sums += cnts[i];
        }
        return 0;
    }

    public int hIndexV2(int[] citations) {
        int max1 = 0;
        int length = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            max1 = Math.max(max1, Math.min((length - i), citations[i]));
        }
        return max1;
    }
    
}
