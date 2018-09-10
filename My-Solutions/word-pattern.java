class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        
        String[] splited = str.split("\\s+");
        
        if(splited.length != pattern.length())
            return false;
        
        HashMap<Character,String> map1 = new HashMap<Character,String>();
        HashMap<String,Character> map2 = new HashMap<String,Character>();
        
        for(int i=0 ; i < pattern.length() ; i++){
            if(map1.get(pattern.charAt(i)) == null){
                map1.put(pattern.charAt(i), splited[i]);
                
            }
            else if(!map1.get(pattern.charAt(i)).equals(splited[i])){
                return false;
            }
            
            if(map2.get(splited[i]) == null){
                map2.put(splited[i] ,pattern.charAt(i));
                
            }
            else if(!map2.get(splited[i]).equals(pattern.charAt(i))){
                return false;
            }
                
        }
        return true;
    }
}
