class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        
        List<Integer> result = new ArrayList<Integer>();
        
        if(s.length() ==0)
            return result;
        if(s.length() < p.length())
            return result;
        
        
        
        int[] pattern = new int[26];
        int[] check = new int[26];
        char start = s.charAt(0);
        int end = p.length() - 1;
        
        for(int i = 0; i < p.length(); i++){
            pattern[p.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i< p.length(); i++){
            check[s.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<= s.length() - p.length(); i++){
            
            int stop=0;
            for(int j=0; j<26 && stop == 0; j++){
                if(pattern[j]!=check[j])
                    stop = 1;
            }
            
            if(stop==0)
                result.add(i);
            
            if(i<= s.length() - p.length() && end+1 < s.length()){
            check[start - 'a']--;
            start = s.charAt(i+1);
            check[s.charAt(end+1) - 'a']++;
            end = end + 1;
            }
            
        }
        
        return result;
        
    }  
}
