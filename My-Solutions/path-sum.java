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
    public boolean hasPathSum(TreeNode root, int sum) {
        List<Integer> result = new ArrayList<Integer>();
        int pathsum = 0;
        result = pathSum(root,pathsum,result);
        for(int n : result){
            if(sum == n) return true;
        }
        return false;
    }
    
    
    public List<Integer> pathSum(TreeNode root,int pathsum,List<Integer> result){
        if(root==null) return result;
        pathsum = pathsum + root.val;
        if(root.left == null && root.right == null) result.add(pathsum);
        pathSum(root.left,pathsum,result);
        pathSum(root.right,pathsum,result);
        return result;
        
    }
}
