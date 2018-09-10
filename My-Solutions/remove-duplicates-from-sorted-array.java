class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length >= 1){
        int cur_num = nums[0];
        int cur_pointer = 0;
        int count = 1;
        
        for(int i = 1 ; i < nums.length ; i++){
            
            if(nums[i] != cur_num){
                cur_pointer++;
                nums[cur_pointer] = nums[i];
                cur_num = nums[i];
                count++;
                
            }   
        }
        
        return count;
        }
        else {
            return 0;
        }
    }
}
