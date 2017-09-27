package pers.you.learning.leetcode.seventeennine;

import java.util.Stack;

/*
'''
【Python3代码不变,故此Python2代码可做参考】
LeetCode682. Baseball Game
You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.

Example 1:
Input: ["5","2","C","D","+"]
Output: 30
Explanation:
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get 2 points. The sum is: 7.
Operation 1: The round 2's data was invalid. The sum is: 5.
Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
Example 2:
Input: ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get -2 points. The sum is: 3.
Round 3: You could get 4 points. The sum is: 7.
Operation 1: The round 3's data is invalid. The sum is: 3.
Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
Round 5: You could get 9 points. The sum is: 8.
Round 6: You could get -4 + 9 = 5 points. The sum is 13.
Round 7: You could get 9 + 5 = 14 points. The sum is 27.
Note:
The size of the input list will be between 1 and 1000.
Every integer represented in the list will be between -30000 and 30000.
'''
 */
public class BaseballGame {
    // 网友实现
    public int calPointsV1(String[] ops) {
        int sum = 0, i = 0;
        int[] numbers = new int[ops.length];
        for (String s : ops) {
            if (s.equals("+")) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
                sum += numbers[i++];
            } else if (s.equals("C")) {
                sum -= numbers[--i];
            } else if (s.equals("D")) {
                numbers[i] = numbers[i - 1] << 1;
                sum += numbers[i++];
            } else {
                numbers[i] = Integer.parseInt(s);
                sum += numbers[i++];
            }

        }
        return sum;
    }

    public int sum(Stack<Integer> numbers) {
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        return sum;
    }

    public int calPointsV2(String[] ops) {
        Stack<Integer> numbers = new Stack<Integer>();
        for (String i : ops) {
            if (i.equals("C")) {
                numbers.pop();
            } else if (i.equals("D")) {
                numbers.push(numbers.peek() * 2);
            } else if (i.equals("+")) {
                int temp1 = numbers.pop();
                int temp2 = numbers.peek();
                numbers.push(temp1);
                numbers.push(temp1 + temp2);
            } else {
                numbers.push(Integer.valueOf(i));
            }
        }
        return sum(numbers);
    }
}
