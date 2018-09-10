class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int cur_count = 0;
        int max = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                cur_count++;
            }
            else{
                if(cur_count > max){
                    max = cur_count;
                }
                cur_count =0;
            }
        }
        
        return Math.max(cur_count,max);
    }
}
