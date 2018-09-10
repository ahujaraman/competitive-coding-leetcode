class Solution {
    public int majorityElement(int[] nums) {
       /* Arrays.sort(nums);
            return nums[nums.length/2];  
        */
        
       int count = 0;
        Integer candidate = null;
        
        for(int i =0; i < nums.length ; i++){
            if(count == 0){
                candidate = nums[i];
            }
            
            if(nums[i] == candidate) count++;
            else count--;
        }
        return candidate;
    }
}
