class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        /*
           O(nlogn) - Sorting solution
        */
       /* Arrays.sort(nums);
        int stop = 0 ;
        
        if(nums.length == 0 || nums.length == 1)
            return false;
        
        for(int i=0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1])
            {
                stop = 1;
                return true;
            }
        }
        
        return false; */
        
        
        /*
           O(n) - Hashing  solution
           O(n) - Space complexity
        */
         if(nums.length == 0 || nums.length == 1)
            return false;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i< nums.length ; i++){
            if(map.get(nums[i]) == null)
                map.put(nums[i],1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
             if(entry.getValue() > 1) return true; }
        
        return false;
        
    }
}
