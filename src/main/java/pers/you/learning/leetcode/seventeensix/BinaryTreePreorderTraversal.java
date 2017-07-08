package pers.you.learning.leetcode.seventeensix;

/*
【极客学院版】
LeetCode144. Binary Tree Preorder Traversal
 Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].
 */


import java.util.ArrayList;
import java.util.List;

class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

public class BinaryTreePreorderTraversal {
public List<Integer> preorderTraversal(TreeNode root){
    List<Integer> list = new ArrayList<Integer>();
    preOrder(root, list);
    return list;
}

private void preOrder(TreeNode p,List<Integer> list){
    if(p!=null){
        list.add(p.val);
        preOrder(p.left, list);
        preOrder(p.right, list);
    }
}
    
}
