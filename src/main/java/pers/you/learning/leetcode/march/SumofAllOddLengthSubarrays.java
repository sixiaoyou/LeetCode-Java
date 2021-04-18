package pers.you.learning.leetcode.march;

import java.util.ArrayList;
import java.util.List;

/*
LeetCode 1588. 所有奇数长度子数组的和
给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。

子数组 定义为原数组中的一个连续子序列。

请你返回 arr 中 所有奇数长度子数组的和 。

 

示例 1：

输入：arr = [1,4,2,5,3]
输出：58
解释：所有奇数长度子数组和它们的和为：
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
我们将所有值求和得到 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
示例 2：

输入：arr = [1,2]
输出：3
解释：总共只有 2 个长度为奇数的子数组，[1] 和 [2]。它们的和为 3 。
示例 3：

输入：arr = [10,11,12]
输出：66
 

提示：

1 <= arr.length <= 100
1 <= arr[i] <= 1000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class SumofAllOddLengthSubarrays {
    public int sum(int start,int end,int[] arr){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
    
    
    
    public int sumOddLengthSubarrays(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int res = 0;
        for(int i=0;i<arr.length;i+=2){
            list.add(i);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<list.size();j++){
                if(i+list.get(j)<arr.length){
                res+=sum(i,i+list.get(j),arr);
                }
            }
        }
        return res;
    }
}
