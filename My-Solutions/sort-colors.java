class Solution {
    public void sortColors(int[] nums) {
        
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count_zero ++;
            }
            else if (nums[i] == 1){
                count_one ++;
            }
            else{
                count_two++;
            }
        }
        
        for(int i = 0; i<count_zero; i++){
            nums[i] = 0;
        }
        
        int i = count_zero;
        
        while(count_one > 0){
            nums[i] = 1;
            i++;
            count_one--;
        }
        
        while(count_two > 0){
            nums[i] = 2;
            i++;
            count_two--;
        }
    }
}
