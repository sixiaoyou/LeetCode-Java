package pers.you.learning.leetcode.march;

/*
LeetCode 1572. 矩阵对角线元素的和
给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。

请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。

 

示例  1：



输入：mat = [[1,2,3],
            [4,5,6],
            [7,8,9]]
输出：25
解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
请注意，元素 mat[1][1] = 5 只会被计算一次。
示例  2：

输入：mat = [[1,1,1,1],
            [1,1,1,1],
            [1,1,1,1],
            [1,1,1,1]]
输出：8
示例 3：

输入：mat = [[5]]
输出：5
 

提示：

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
通过次数15,219提交次数18,894

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/matrix-diagonal-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int start1=0;
        int start2=0;
        int res=0;
        int l1 = mat.length;
        int end = mat[0].length-1;
        while(start1<l1){
            res+=mat[start1][start1];
            start1+=1;
            res+=mat[start2][end];
            start2+=1;
            end-=1;
        }
        if(l1%2==1){
            res-=mat[l1/2][l1/2];
        }
        return res;
    }
}
