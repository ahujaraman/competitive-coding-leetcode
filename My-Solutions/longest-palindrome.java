class Solution {
    public int longestPalindrome(String s) {
        
        
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i = 0; i < s.length() ; i++){
            if(map.get(s.charAt(i)) ==null)
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        
        int max_odd = 0;
        
        for (HashMap.Entry<Character, Integer> entry : map.entrySet())
            {
                if(entry.getValue()%2 == 0)
                    count += entry.getValue();
                else{
                    count += entry.getValue() - 1;
                    max_odd = 1;
                }     
            }
        if(max_odd == 0){
            return count;
        }
        else{
            return count + 1;
        } 
    }
}
