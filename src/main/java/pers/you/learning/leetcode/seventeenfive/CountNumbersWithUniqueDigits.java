/*
【网友实现】:http://bookshadow.com/weblog/2016/06/13/leetcode-count-numbers-with-unique-digits/
LeetCode357:Count Numbers with Unique Digits
Total Accepted: 31907
Total Submissions: 69917
Difficulty: Medium
Contributor: LeetCode
Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:
Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])

Credits:
Special thanks to @memoryless for adding this problem and creating all test cases.
 */

package pers.you.learning.leetcode.seventeenfive;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        int sum = 1;
        int mul = 9;int count=9;
        while(n!=0){        
            sum+=mul;
            mul*=count--;
            n--;
        }
        return sum;
    }
}
