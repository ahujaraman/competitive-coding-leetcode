class Solution {
    public int islandPerimeter(int[][] grid) {
        
      int count = 0;
        
        for(int row = 0 ; row < grid.length ; row++){
            for(int col=0; col < grid[row].length; col++){
                
                    int row_length = grid.length;
                    int col_length = grid[row].length;
                
                    if(grid[row][col] == 1 )
                    {
                        count = count + 4;
                        
                        if(row+1 < row_length && grid[row+1][col] == 1)
                        {
                            count = count - 1;
                        }
                        if(row - 1 >=0  && grid[row-1][col] == 1)
                        {
                            count = count - 1;
                        }
                        if(col+1 < col_length && grid[row][col+1] == 1)
                        {
                            count = count - 1;
                        }
                        if(col - 1 >= 0 && grid[row][col-1] == 1)
                        {
                            count = count - 1;
                        }
                    }
            
            }
        }
        
        return count;
        
    }
}
