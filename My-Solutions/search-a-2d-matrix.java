class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
       /*  -- 12 ms runtime
       else{
             
            for(int i = 0 ; i < matrix.length ; i++){

                int col_length = matrix[i].length;
                if(target >= matrix[i][0] && target <= matrix[i][col_length-1]){

                    int[] arr = matrix[i];
                    if( Arrays.binarySearch(arr, target) >=0){
                            return true;
                        }
                }
            }
        } */
        
        
        
        for(int i = 0 ; i < matrix.length ; i++){
                int col_length = matrix[i].length;
                
                if(target > matrix[i][col_length -1])
                    continue;
                if(target >= matrix[i][0]){
                    int stop = 0;
                    while(col_length>=1 && stop == 0){
                        if(matrix[i][col_length -1] == target) 
                        {
                          stop = 1;
                            return true;  
                        }   
                        col_length--;
                    }
                }
            
            
        }
        
        return false;
        
    }
}
