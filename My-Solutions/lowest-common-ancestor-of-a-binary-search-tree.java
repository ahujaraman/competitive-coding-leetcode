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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left,p,q);
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    
    /*public TreeNode lca(TreeNode root, int left, int right){
        if(root== null) return null;
        if(left <= root.val && root.val <= right) return root;
        else if(root.val > right) return lca(root.left,left,right);
        return lca(root.right,left,right);
    } */
}
