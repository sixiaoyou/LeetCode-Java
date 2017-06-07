package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode94. Binary Tree Inorder Traversal
 Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].
 */

import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class BinaryTreeInorderTraversal {
   public List<Integer> list = null;
   public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();
        inOrder(root);
        return list;
    }
   private void inOrder(TreeNode p){
       if(p!=null){
           inOrder(p.left);
           list.add(p.val);
           inOrder(p.right);
       }
   }
    
}
