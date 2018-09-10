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
    /* public List<String> binaryTreePaths(TreeNode root) {
        String cur = "";
        List<String> result = new ArrayList<String>();
        result = paths(root,result,cur);
        return result;
    }
    
    
    public List<String> paths(TreeNode root, List<String> result, String cur){
        if(root == null) return result;
        if(root.left == null && root.right == null) cur = cur + root.val;
        else cur = cur +  root.val + "->";
        if(root.left == null && root.right == null){
            result.add(cur);
            return result;
        }
        paths(root.left,result,cur);
        paths(root.right,result,cur);
        return result;   
    } */
    
    
    
    
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        String path = "";
        paths = searchPaths(root,path,paths);
        System.out.println(paths.toString());
        return paths;
    }
    public List<String> searchPaths(TreeNode root,String path,List<String> sb) {
       if(root==null) return sb;
         if(root.left == null && root.right == null) {
             path = path + Integer.toString(root.val);
         }
        else path = path +Integer.toString(root.val)+ "->";
        
        if(root.left == null && root.right == null) {
           
            sb.add(path);
            return sb;
        }
        if(root.left != null) {
            //path = path +Integer.toString(root.val)+ "->";
            searchPaths(root.left,path,sb);
        }
        if(root.right != null) {
            //path = path + Integer.toString(root.val)+ "->";
            searchPaths(root.right,path,sb);
        }
        return sb;
    }
}
