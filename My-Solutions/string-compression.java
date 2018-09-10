class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return chars.length;
        
        int pointer = 0;
        int count = 1;
        char cur_char = chars[0];
        for(int i =1;i<chars.length; i++){
            if(cur_char != chars[i]){
                if(count == 1){
                    chars[pointer] = cur_char;
                    pointer++;
                    cur_char = chars[i];
                    count = 1;
                }
                else{   
                    chars[pointer] = cur_char;
                    cur_char = chars[i];
                    pointer++;
                    char[] chars_count = ("" + count).toCharArray();
                    for(char c : chars_count){
                        chars[pointer] = c;
                        pointer++;
                    }
                    count=1;
                }   
            }
            else{
                  count++;
            }
        }
             if(count == 1){
                    chars[pointer] = cur_char;
                    pointer++;
                }
                else{   
                    chars[pointer] = cur_char;
                    pointer++;
                    char[] chars_count = ("" + count).toCharArray();
                    for(char c : chars_count){
                        chars[pointer] = c;
                        pointer++;
                    }
                } 
        return pointer;
    }
}
