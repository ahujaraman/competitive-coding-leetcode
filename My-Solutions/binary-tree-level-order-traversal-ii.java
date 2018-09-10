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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result_reverse = new ArrayList<List<Integer>>();
        if(root== null) return result_reverse;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        while(!que.isEmpty()){
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            List<Integer> curList = new ArrayList<Integer>();
            while(!que.isEmpty()){
                TreeNode cur = que.remove();
                curList.add(cur.val);
                if(cur.left!=null) temp.add(cur.left);
                if(cur.right!=null) temp.add(cur.right);
            }
            result_reverse.add(curList);
            que = temp;
        }
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        System.out.println(result_reverse.size());
        int size = result_reverse.size();
        for(int i= (size-1);i>=0;i--){
            result.add(result_reverse.get(i));
        }
        
        return result;
    }
}
