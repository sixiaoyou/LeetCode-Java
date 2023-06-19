/*
 [LeetCode2520. Count the Digits That Divide a Number]

 Given an integer num, return the number of digits in num that divide num.

 An integer val divides nums if nums % val == 0.



 Example 1:

 Input: num = 7
 Output: 1
 Explanation: 7 divides itself, hence the answer is 1.
 Example 2:

 Input: num = 121
 Output: 2
 Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
 Example 3:

 Input: num = 1248
 Output: 4
 Explanation: 1248 is divisible by all of its digits, hence the answer is 4.


 Constraints:

 1 <= num <= 109
 num does not contain 0 as one of its digits.
*/

package sourcecode_2023.February;


public class LeetCode2520_CountTheDigitsThatDivideANumber {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: year_2023.February
     * @CreateTime: 2023/2/19 23:05
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public int countDigitsV1(int num) {
        int count = 0;
        int cnum = num;
        while (num != 0) {
            if (cnum % (num % 10) == 0) {
                count += 1;
            }
            num /= 10;
        }
        return count;

    }

    public int countDigitsV2(int num) {
        int count = 0;
        for (Character c : String.valueOf(num).toCharArray()) {
            if (num % Integer.parseInt(String.valueOf(c)) == 0) {
                count += 1;
            }
        }
        return count;
    }
}
