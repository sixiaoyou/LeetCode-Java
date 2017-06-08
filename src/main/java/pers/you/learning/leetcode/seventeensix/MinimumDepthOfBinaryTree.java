package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode111. Minimum Depth of Binary Tree
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */



public class MinimumDepthOfBinaryTree {
    /**
     * Definition for a binary tree node. public class TreeNode { int val;
     * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
     */
    public class Solution {
        int min = Integer.MAX_VALUE;

        public void order(TreeNode p, int level) {
            if (p != null) {
                if (p.left == null && p.right == null) {
                    if (min > level) {
                        min = level;
                    }
                }
                order(p.left, level + 1);
                order(p.right, level + 1);
            }

        }

        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            order(root, 1);
            return min;
        }
    }
}
