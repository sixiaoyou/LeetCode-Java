/*
LeetCode537:Complex Number Multiplication
Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
Note:

The input strings will not have extra blank.
The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 */



package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        String[] aS=a.split("\\+");
        String[] bS=b.split("\\+");

        int rr=Integer.parseInt(aS[0])*Integer.parseInt(bS[0]);
        int ii=-Integer.parseInt(aS[1].substring(0,aS[1].length()-1))*Integer.parseInt(bS[1].substring(0,bS[1].length()-1));
        String ri=String.valueOf(Integer.parseInt(aS[1].substring(0,aS[1].length()-1))*Integer.parseInt(bS[0])+Integer.parseInt(bS[1].substring(0,bS[1].length()-1))*Integer.parseInt(aS[0]))+"i";

        return rr+ii+"+"+ri;
    }
}
