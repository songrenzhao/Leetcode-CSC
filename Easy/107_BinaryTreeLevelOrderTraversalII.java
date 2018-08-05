/*
107. Binary Tree Level Order Traversal II
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
       List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null)
            return result;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> layer = new LinkedList<Integer>();
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                layer.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            result.add(0,layer);
        }
        return result;
        
    }
}
