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
    
    Integer prev = null;
    int max = 0;
    int count = 1;
    
    public int[] findMode(TreeNode root) {
      /*  O(n) space extra with Map solution
      
      
        int[] result = new int[0];
        if(root == null) return result;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map = modeSet(root,map);
        
        int max_freq = 0;
        
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            max_freq = (max_freq < entry.getValue()) ? entry.getValue() : max_freq;
        }
        
        List<Integer> ansList = new ArrayList<Integer>();
        
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){ 
            if(max_freq == entry.getValue()) ansList.add(entry.getKey());
        }
        
        int[] ans = new int[ansList.size()];
        for(int i = 0;i < ans.length;i++)
                ans[i] = ansList.get(i);

        
        
        return ans; */
        
        
         
        if(root == null) return new int[0];;
        
        List<Integer> result = new ArrayList<Integer>();
        modeFreq(root,result);
        int[] ans = new int[result.size()];
        
        for(int i = 0;i < ans.length;i++)
                ans[i] = result.get(i);
        
        return ans;
    }
    
    
    public void modeFreq(TreeNode root, List<Integer> result){
            if(root == null) return ;
        
            modeFreq(root.left,result);
            if(prev!=null)
            {
                if(prev == root.val){
                    count++;
                }
                else{
                    count = 1;
                }
            }
        
            if(count > max){
                result.clear();
                max = count;
                result.add(root.val);
            }
            else if(count == max){
                result.add(root.val);
            }
                
            prev = root.val;
            modeFreq(root.right,result);
    }
    public HashMap<Integer,Integer> modeSet(TreeNode root, HashMap<Integer,Integer> map){
        
        if(root == null) return map;
        modeSet(root.left,map);
        if(map.get(root.val) == null)
            map.put(root.val,1);
        else
            map.put(root.val,map.get(root.val) +1);
        modeSet(root.right,map);
        return map;
    }
}
