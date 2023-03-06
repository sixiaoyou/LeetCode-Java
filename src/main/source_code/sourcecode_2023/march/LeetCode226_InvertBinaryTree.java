/*
[LeetCode226. Invert Binary Tree]
Given the root of a binary tree, invert the tree, and return its root.


Example 1:


Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:


Input: root = [2,1,3]
Output: [2,3,1]
Example 3:

Input: root = []
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */


package sourcecode_2023.march;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class LeetCode226_InvertBinaryTree {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/6
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public TreeNode invertTreeV1(TreeNode root) {

        if(root == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode iroot = root;

        while(stack.size() > 0){
            root = stack.pop();

            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            if(root.left != null){
                stack.push(root.left);
            }

            if(root.right != null){
                stack.push(root.right);
            }

        }

        return iroot;
    }


    public TreeNode invertTreeV2(TreeNode root) {
        if(root == null){
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }
}
