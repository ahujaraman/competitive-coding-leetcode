class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        recursion(result,cur,candidates,target,0);
        return result;
    }
    
    public void recursion(List<List<Integer>> result,List<Integer> cur,int[] candidates,int target,int start){
        if(target<0)
            return;
        else if(target==0){
                result.add(new ArrayList<>(cur));
            return;
        }else{
            for(int i=start;i<candidates.length;i++){
                cur.add(candidates[i]);
                int new_target =  target - candidates[i];
                recursion(result,cur,candidates,new_target,i);
                cur.remove(cur.size()-1);
            }
        }
        return;
    }
}
