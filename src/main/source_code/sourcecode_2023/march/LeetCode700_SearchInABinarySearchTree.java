/*
[LeetCode700. Search in a Binary Search Tree]
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]


Input: root = [4,2,7,1,3], val = 5
Output: []
 */

package sourcecode_2023.march;

public class LeetCode700_SearchInABinarySearchTree {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/3/4
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {

        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

        TreeNode tmp = null;

        public TreeNode searchBST(TreeNode root, int val) {
            TreeNode tmp = null;
            tmp = subSearchBST(root, val);
            return tmp;


        }


        public TreeNode subSearchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }

            if (root.val == val) {
                tmp = root;
                return tmp;
            }

            subSearchBST(root.left, val);
            subSearchBST(root.right, val);

            return tmp;

        }
    }

}
