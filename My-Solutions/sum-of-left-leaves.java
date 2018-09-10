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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) { 
        
        List<Integer> result = new ArrayList<Integer>();
        result = sumLeft(root,result,0);
        for(int n : result){
            sum+=n;
        }
        return sum;    
    }
    
    public List<Integer> sumLeft(TreeNode root, List<Integer> result,int side){
        if(root == null) return result;
        sumLeft(root.left,result,1);
        System.out.println("Rootval: "+root.val+" Side: "+side+" RootLeft: "+root.left+" Root_right:"+root.right);
        if(root.left == null && root.right == null && side == 1) 
        {
           result.add(root.val); 
        }
        sumLeft(root.right,result,0);
        return result;
    }  
}
