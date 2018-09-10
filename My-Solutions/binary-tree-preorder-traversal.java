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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        return preorder(root,result); 
    }
    
    
    public List<Integer> preorder(TreeNode root,List<Integer> result){
        
        if(root == null) return result;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
        return result;
    }
}
