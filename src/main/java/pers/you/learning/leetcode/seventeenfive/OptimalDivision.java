/*
LeetCode553:Optimal Division
Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.

However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. Your expression should NOT contain redundant parenthesis.

Example:
Input: [1000,100,10,2]
Output: "1000/(100/10/2)"
Explanation:
1000/(100/10/2) = 1000/((100/10)/2) = 200
However, the bold parenthesis in "1000/((100/10)/2)" are redundant, 
since they don't influence the operation priority. So you should return "1000/(100/10/2)". 

Other cases:
1000/(100/10)/2 = 50
1000/(100/(10/2)) = 50
1000/100/10/2 = 0.5
1000/100/(10/2) = 2
Note:

The length of the input array is [1, 10].
Elements in the given array will be in range [2, 1000].
There is only one optimal division for each test case.
 */


package pers.you.learning.leetcode.seventeenfive;

public class OptimalDivision {

    //【网友实现】:https://discuss.leetcode.com/topic/86473/o-n-very-easy-java-solution
    public String optimalDivisionV1(int[] nums) {
        StringBuilder s = new StringBuilder();
        s.append(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(i==1&&nums.length>2){
                s.append("/(").append(nums[i]);
            }
            else{
                s.append("/").append(nums[i]);
            }
        }
        return nums.length>2 ? s.append(")").toString():s.toString(); 
    }
    public String optimalDivisionV2(int[] nums) {
        int n = nums.length;
        String s = "";
        if (n == 1) {
            s = String.valueOf(nums[0]);
        } else if (n == 2) {
            s = String.valueOf(nums[0]) + "/" + String.valueOf(nums[1]);
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    s += String.valueOf(nums[i]) + "/(";
                } else if (i == nums.length - 1) {
                    s += String.valueOf(nums[i]) + ")";
                } else {
                    s += String.valueOf(nums[i]) + "/";
                }
            }
        }
        return s;
    }
}
