class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;
        int i = 0;
        
        for(int j = 0; j< nums.length ; j++){
            if(nums[j]!=0){
                nums[i] = nums[j];
                i++;
            }
            else{
                count++;
            }
        }
        
        i = nums.length - 1;
        while(count!=0){
            nums[i] = 0;
            i--;
            count --;
        }
        
    }
}
