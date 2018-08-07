class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        int stop = 0;
        for(int i=0;i<nums.length && stop==0;i++){
            
                if(nums[i] >= target){
                   stop = 1; 
                }
                else{
                    count++;
                }
        }
        return count;
    }
}
