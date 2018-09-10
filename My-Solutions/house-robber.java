class Solution {
    public int rob(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int cur_max = 0;
            for(int j = 0; j < i-1;j++){
                if(nums[j] > cur_max)
                    cur_max = nums[j];
            }
            nums[i] = cur_max + nums[i];
            System.out.println(nums[i]+":i == "+i);
        }
        
        int max = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max)
                max = nums[i];
        }
        return max;
    }
}
