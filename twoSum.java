class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = {0,1};
        int found = 0;
        for(int i=0;i < (nums.length - 1) && found ==0; i++)
        {
            for(int j=i+1;j < (nums.length) && found ==0; j++){
                if(nums[i] + nums[j] == target)
                    {
                        found = 1;
                        result[0] = i;
                        result[1] = j;
                    }
            }
            
        }
        
        return result;
        
    }
}
