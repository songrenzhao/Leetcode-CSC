/*
538. Convert BST to Greater Tree
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
*/

//恕我直言 这题我卡了接近一个小时
//结果做出来的时候 无法面对自己
//Solution in Java
class Solution {
    private int total = 0;
    public TreeNode convertBST(TreeNode root) 
    {
        if(root != null)
        {
            convertBST(root.right);
            total += root.val;
            root.val = total;
            convertBST(root.left);
        }
        return root;
    }
}
