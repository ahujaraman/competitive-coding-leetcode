class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int min_length = 999999999;
        String answer = "";
        
        
        if(strs.length ==0){
            return "";
        }
        else if(strs.length == 1)
            return strs[0];
        
        for (int i=0; i<strs.length ; i++){
            if(strs[i].length() < min_length){
                min_length = strs[i].length() ;
            }
        }
        
        int stop = 0;
        
        if(min_length == 0){
            stop =1;
        }
        for(int i=0 ; i<min_length && stop ==0; i++){
            
            for(int j=0; j< strs.length - 1 && stop == 0; j++){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    stop = 1;
                }
            }
            
        if(stop == 0){
            if(strs[0].length() > 0){
               answer += strs[0].charAt(i);
            }
            
        }    
        }
        
        
        return answer;
        
        
    }
}
