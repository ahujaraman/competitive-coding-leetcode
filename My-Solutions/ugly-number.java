class Solution {
    public boolean isUgly(int num) {
        if(num==0) return false;
        
        int stop=0;
        while(stop==0){
            if(num%2==0) num = num/2;
            else stop = 1;
        }
        
         stop = 0;
         while(stop==0){
            if(num%3==0) num = num/3;
            else stop = 1;
        }
         stop=0;
         while(stop==0){
            if(num%5==0) num = num/5;
            else stop = 1;
        }
        
        return num==1?true:false;
    }
}
