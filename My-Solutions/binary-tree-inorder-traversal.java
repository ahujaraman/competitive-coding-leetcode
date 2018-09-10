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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        return inorder(root,result);    
    }
    
    public List<Integer> inorder(TreeNode root,List<Integer> result){
            
        if(root == null) return result;
        
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
        return result;
    }
}
