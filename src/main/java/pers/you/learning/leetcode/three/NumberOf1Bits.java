package pers.you.learning.leetcode.three;

import java.util.function.BinaryOperator;

import javax.print.attribute.standard.RequestingUserName;

public class NumberOf1Bits {

	public int hammingWeightV1(int n) {
		String string = "";
		string = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '1') {
				count += 1;
			}
		}
		return count;
	}

	// 网友实现：http://bookshadow.com/weblog/2015/03/10/leetcode-number-1-bits/
	public int hammingWeightV2(int n) {
		int count = 0;
		while (n != 0) {
			count += n & 1;
			n >>>= 1;
		}
		return count;
	}

	public void hammingWeightTestCase(int n) {
		System.out.println(hammingWeightV1(n));
		System.out.println(hammingWeightV2(n));
	}

	public NumberOf1Bits(int n) {
		hammingWeightTestCase(n);
	}

	public static void main(String[] args) {
		NumberOf1Bits test = new NumberOf1Bits(11);
	}
}
