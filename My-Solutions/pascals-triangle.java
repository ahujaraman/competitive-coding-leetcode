class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
                if(numRows == 0) return result;
        List<Integer> specList = new ArrayList<Integer>();
        specList.add(1);
        result.add(specList);
        List<Integer> sList = new ArrayList<Integer>();
        sList.add(1);
            sList.add(1);
        

        if(numRows == 1) return result;
        if (numRows == 2){
            result.add(sList);
            return result;}
        
        
        result.add(sList);
        List<Integer> assignList = new ArrayList<Integer>();
        for(int i=3;i<=numRows;i++){
            
            List<Integer> prevList = new ArrayList<Integer>();
            prevList = new ArrayList<>(assignList);
            if(i==3) prevList = new ArrayList<>(sList);
            List<Integer> curList = new ArrayList<Integer>();
             /* As lists work with index 0 */
            
            
            System.out.println("Size: "+ prevList.size()+" i:"+i);
            curList.add(1);
            int q =0;
            for(int j=2;j<i; j++){
                int val = prevList.get(q) + prevList.get(q+1);
                curList.add(val);
                q++;
            } 
            curList.add(1);
            assignList = new ArrayList<>(curList);
            result.add(curList);
        }
        
        return result;     
    }
}
