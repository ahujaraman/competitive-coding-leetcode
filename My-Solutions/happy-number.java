class Solution {
    public boolean isHappy(int n) {
        int cur = n;
        int next = n;
        
        int stop =0;
        while( stop == 0){
            
            cur = Square(cur);
            
            if(cur == 1)
                return true;
            
            next = Square(Square(next));
            
            if(next == 1)
                return true;
            
            if(cur == next)
                return false;
            
        }
        return false;
    }
    
    
    int Square(int n){
        
        int result = 0;
        while(n != 0){
            int digit = n%10;
            result = result + digit*digit;
            n = n/10;
        }
        return result;
    }
}
