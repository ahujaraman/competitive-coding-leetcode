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
   /*  Inorder Travesal and then check from right and left, failed for two cases. Incorrect solution.
   public boolean isSymmetric(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        result =  inorder(root,result);
        int i = 0,j = result.size() - 1,stop = 0;
        while(i<j && stop ==0){
            if(result.get(i) != result.get(j)) stop = 1;
            else{
                i++;
                j--;
            }
        }
        return (stop==0?true:false);
        
    }
    
    public List<Integer> inorder(TreeNode root, List<Integer> result){
        if(root == null) return result;
        
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right, result);
        return result;
    } */
    
    
    public boolean isSymmetric(TreeNode root) {
        
        return isSym(root,root);
    }
    
    public boolean isSym(TreeNode x,TreeNode y){
        if(x== null && y == null) return true;
        if(x== null || y == null) return false;
        return (x.val == y.val) && isSym(x.left,y.right) && isSym(x.right,y.left);
    }
}
