/// Source : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
/// Author : liuyubobobo
/// Time   : 2017-11-18

/// Recursive
/// Time Complexity: O(lgn), where n is the node's number of the tree
/// Space Complexity: O(h), where h is the height of the tree
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(p == null || q == null)
            throw new IllegalArgumentException("p or q can not be null.");

        if(root == null)
            return null;

        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);

        assert p.val == root.val || q.val == root.val
                || (root.val - p.val) * (root.val - q.val) < 0;

        return root;
    }
}
