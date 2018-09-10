class Solution {
    public boolean isValid(String s) {
        
      Stack<Character> stack = new Stack<Character>();
      int stop =0;
        
        if(s == null && s.isEmpty())
            return false;
        for(int i = 0 ; i<s.length() && stop == 0 ; i++){
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '['  || ch == '{' ){
                stack.push(ch);   
            }
            else
            {
                
                if(!stack.isEmpty()){
                    char ch_top = stack.pop();
                    if(ch == ')'  && ch_top != '('){
                    stop = 1;
                    return false;
                    }
                    else if(ch == ']'  && ch_top != '['){
                     stop = 1;
                    return false; 
                    }
                    else if(ch == '}'  && ch_top != '{'){
                    stop = 1;
                    return false;
                    }
               }
                else{
                    return false;
                }  
            }
        }
        
        if(!stack.isEmpty())
        {
            return false;
        }
        else{
            return true;
        }
    }
}
