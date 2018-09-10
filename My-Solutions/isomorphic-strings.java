class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map1 = new HashMap<Character,Character>();
        HashMap<Character,Character> map2 = new HashMap<Character,Character>();
        
        for(int i=0; i<s.length() ; i++){
            char cur_s = s.charAt(i);
            char cur_t = t.charAt(i);
            
            if(map1.get(cur_s) == null){
                map1.put(cur_s,cur_t);
            }
            else if(map1.get(cur_s)!= cur_t)
                return false;
            
            if(map2.get(cur_t) == null){
                map2.put(cur_t,cur_s);
            }
            else if(map2.get(cur_t)!= cur_s)
                return false;
        }
        
        return true;
    }
}
