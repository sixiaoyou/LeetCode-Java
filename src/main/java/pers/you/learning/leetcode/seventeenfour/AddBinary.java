package pers.you.learning.leetcode.seventeenfour;


/*
LeetCode 67:Add Binary
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */



import org.junit.Ignore;
import org.junit.Test;

public class AddBinary {

    public String delayBinary(String a, String b) {
        int count = 0;
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        int diff = arrayB.length - arrayA.length;
        for (int i = arrayA.length - 1; i >= 0; i--) {
            int number = arrayA[i] - '0' + arrayB[i + diff] - '0' + count;
            if (number >= 2) {
                arrayB[i + diff] = (char) (number - 2 + 48);
                count = 1;
            } else {
                arrayB[i + diff] = (char) (number + 48);
                count = 0;
            }
        }
        if (count != 0) {
            for (int j = diff - 1; j >= 0; j--) {
                int number = arrayB[j] + '0' + count;
                if (number >= 2) {
                    arrayB[j] = (char) (number - 2 + 48);
                    count = 1;
                } else {
                    arrayB[j] = (char) (number + 48);
                    count = 0;
                }
            }
        }
        String c = new String(arrayB);
        if (count == 1) {
            c = "1" + c;
        }
        return c;
    }

    public String addBinaryV1(String a, String b) {
        if (a.length() <= b.length()) {
            return delayBinary(a, b);
        } else {
            return delayBinary(b, a);
        }
    }

    
    //网友实现:https://discuss.leetcode.com/topic/13698/short-ac-solution-in-java-with-explanation
    public String addBinaryV2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
