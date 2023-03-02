/*

[LeetCode1469. Find All The Lonely Nodes]
In a binary tree, a lonely node is a node that is the only child of its parent node. The root of the tree is not lonely because it does not have a parent node.

Given the root of a binary tree, return an array containing the values of all lonely nodes in the tree. Return the list in any order.

Input: root = [1,2,3,null,4]
Output: [4]
Explanation: Light blue node is the only lonely node.
Node 1 is the root and is not lonely.
Nodes 2 and 3 have the same parent and are not lonely.

Input: root = [7,1,4,6,null,5,3,null,null,null,null,null,2]
Output: [6,2]
Explanation: Light blue nodes are lonely nodes.
Please remember that order doesn't matter, [2,6] is also an acceptable answer.

Input: root = [11,99,88,77,null,null,66,55,null,null,44,33,null,null,22]
Output: [77,55,33,66,44,22]
Explanation: Nodes 99 and 88 share the same parent. Node 11 is the root.
All other nodes are lonely.

Constraints:

The number of nodes in the tree is in the range [1, 1000].
1 <= Node.val <= 106
 */


package sourcecode_2023.march;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode1469_FindAllTheLonelyNodes {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/2
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {

        List<Integer> res = new ArrayList<Integer>();
        public List<Integer> getLonelyNodes(TreeNode root) {

            if(root == null){
                return null;
            }

            if(root.right != null && root.left == null){
                res.add(root.right.val);
            }

            if(root.left != null && root.right == null){
                res.add(root.left.val);
            }

            getLonelyNodes(root.left);
            getLonelyNodes(root.right);

            return res;

        }
    }
}
