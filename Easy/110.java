/*
110. Balanced Binary Tree
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.
*/

//Solution in Java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(count(root) <= -1)
            return false;
        return true;
    }
    public int count(TreeNode root)
    {
        if(root == null)
            return 0;
        int left = count(root.left);
        int right = count(root.right);
        if(Math.abs(left - right) > 1 || left == -1 || right == -1)
            return -1;
        else
            return 1 + Math.max(left, right);
    }
}
