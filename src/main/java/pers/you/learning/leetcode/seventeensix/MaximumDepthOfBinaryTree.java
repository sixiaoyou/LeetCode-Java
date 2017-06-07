package pers.you.learning.leetcode.seventeensix;

/*
【极客学院】
 LeetCode104. Maximum Depth of Binary Tree
 Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */


public class MaximumDepthOfBinaryTree {
    /**
     * Definition for a binary tree node. public class TreeNode { int val;
     * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
     */
    public class SolutionV1 {
        public int maxDepth(TreeNode root) {
            return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public class SolutionV2 {
        int max = 0;

        public int maxDepth(TreeNode root) {
            order(root, 1);
            return max;
        }

        public void order(TreeNode p, int level) {
            if (p != null) {
                if (p.left == null && p.right == null) {
                    if (max < level) {
                        max = level;
                    }
                }
                order(p.left, level + 1);
                order(p.right, level + 1);

            }
        }
    }
}
