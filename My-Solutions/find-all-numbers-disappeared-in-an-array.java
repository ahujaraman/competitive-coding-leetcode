class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        /* Space - O(n)
           Time - O(n)
        */
       /* int[] check = new int[nums.length+1];
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i<nums.length; i++){
            check[nums[i]] = 1;
        }
        
        
        for(int i = 1 ; i < check.length; i++){
            if(check[i] !=1)
                result.add(i);
        }
        
        return result; */
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i]) - 1;;
            if(nums[val]>0){
                nums[val] = -nums[val];
            }
        }
        
        
        for(int i=0; i< nums.length; i++){
                if(nums[i] > 0){
                    result.add(i+1);
                }
        }
        
        return result;
    }
}
