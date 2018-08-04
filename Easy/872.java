/*
872. Leaf-Similar Trees    
Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.



For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 

Note:

Both of the given trees will have between 1 and 100 nodes.
*/

//Solution in Java
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> one = new ArrayList();
        List<Integer> two = new ArrayList();
        
        dps(root1, one);
        dps(root2, two);
        return one.equals(two);
    }
    public void dps(TreeNode root, List<Integer> list)
    {
        if(root != null)
        {
            if(root.left == null && root.right == null)
                list.add(root.val);
            dps(root.left, list);
            dps(root.right, list);
        }
    }
}
