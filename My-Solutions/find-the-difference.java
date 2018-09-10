class Solution {
    public char findTheDifference(String s, String t) {
        
        /*
        int[] map = new int[26];
        char c='a';
        
        for(int i=0;i<s.length();i++){
            map[s.charAt(i) - 'a']++;
        }
        int stop =0;
        for(int i=0;i<t.length() && stop ==0;i++){
            
            if(map[t.charAt(i) - 'a'] > 0) map[t.charAt(i) - 'a']--;
            else
            {
                stop=0;
                c= t.charAt(i);
                return t.charAt(i);
            }
        }
        return c;
        */
        
        /* Bit manipulation */
        char c=0;
        
        for(int i=0;i<s.length();i++){
            c ^= s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            c ^= t.charAt(i);
        }
        return c;
    }
}
