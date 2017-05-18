package pers.you.learning.leetcode.seventeenfive;

/*
【网友实现】:http://bookshadow.com/weblog/2017/02/12/leetcode-base-7/
LeetCode504:Base 7
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
Example 2:
Input: -7
Output: "-10"
Note: The input will be in range of [-1e7, 1e7].
 */
public class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(String.valueOf(n % 7));
            n /= 7;
        }
        if (num > 0) {
            return sb.reverse().toString();
        } else {
            return "-" + sb.toString();
        }
    }
}
