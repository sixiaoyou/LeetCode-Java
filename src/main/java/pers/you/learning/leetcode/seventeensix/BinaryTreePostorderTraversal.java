package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode145. Binary Tree Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].
 */

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreePostorderTraversal {
   List<Integer> list;
  public List<Integer> postorderTraversal(TreeNode root) {
      list = new ArrayList<Integer>();
      postOrder(root);
      return list;
    }
     
    private void postOrder(TreeNode p){
        if(p!=null){
            postOrder(p.left);
            postOrder(p.right);
            list.add(p.val);
        }
    }
}
