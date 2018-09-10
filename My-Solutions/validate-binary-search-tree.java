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
    public boolean isValidBST(TreeNode root) {
        
        
       /* if(root == null) return true;
        boolean left_tree = true; 
        boolean right_tree = true; 
        if(root.left !=null && root.left.val >= root.val) 
            left_tree = false;
        if(root.right !=null && root.right.val <= root.val) 
            right_tree = false;
            
        return  left_tree && right_tree && isValidBST(root.left) && isValidBST(root.right); */
   
        List<Integer> result = new ArrayList<Integer>();
        result = inorder(root,result);
        int stop =0;
        for(int i=0;i< result.size() -1 && stop == 0 ; i++)
        {
            if(result.get(i) >= result.get(i+1))
            {
                stop = 1;
            }
        }
        return stop==0?true:false; 
        
    }
    
    List<Integer> inorder(TreeNode root, List<Integer> result){
        if(root == null) return result;
        
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right,result);
        return result;
    }
}
