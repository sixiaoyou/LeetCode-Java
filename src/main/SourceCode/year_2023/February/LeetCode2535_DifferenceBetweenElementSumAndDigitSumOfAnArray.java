package year_2023.February;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.Constants;

/*
【LeetCode2535. Difference Between Element Sum and Digit Sum of an Array】

You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.



Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.


Constraints:

1 <= nums.length <= 2000
1 <= nums[i] <= 2000
 */


public class LeetCode2535_DifferenceBetweenElementSumAndDigitSumOfAnArray {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: year_2023
     * @CreateTime: 2023/2/19 17:00
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    final boolean TRUE_RESULT = true;

    /**
     * @BeforeClass 方法 为类初始化方法
     * 属于模块公共方法，用于编写模块公共初始化代码
     * 除特殊情况外，一定要标注 alwaysRun = true
     */

    @BeforeClass(alwaysRun = true)
    public void class_setup(){
        System.out.println("Initialize test...");
    }

    /**
     * @AfterClass 方法 为类清除方法
     * 属于模块公共方法，用于编写模块公共清理代码
     * 除特殊情况外，一定要标注 alwaysRun = true
     */
    @AfterClass(alwaysRun = true)
    public void class_teardown(){
        System.out.println("Clear test...");
    }


    @Test(description = "assertEqualsTest")
    public void assertEqualsTest(){
        int[] nums = {1, 15, 6, 3};
        Assert.assertEquals(differenceOfSum(nums), 9);
    }

    public int getSum(int[] nums){
        int sum = 0;
        for(Integer j: nums){
            sum += j;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for (Integer i : nums) {

            while (i >= 10) {
                sum += i % 10;
                i = Math.floorDiv(i ,10);
            }
            sum += i;

        }
        return Math.abs(sum - getSum(nums));
    }
}
