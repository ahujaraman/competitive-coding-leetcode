class Solution {
    public int maxArea(int[] height) {
        
        int max_area = 0;
        
        for(int i =0; i< height.length ; i++){
            for(int j = i+1; j< height.length ; j++){
                if(height[j] < height[i]){
                        if(height[j]*(j - i) > max_area){
                                max_area = height[j]* (j -i);
                            }
                }
                else{
                    if(height[i]*(j - i) > max_area){
                                max_area = height[i]* (j -i);
                            }
                }
                
                
            }
        }
      
        return max_area;
    }
}
