class Solution {
    public int brokenCalc(int X, int Y) {
        int result = 0;
        while (X<Y){
            if(Y%2==0){
                Y = Y/2;
                result+=1;
            }else{
                Y = (Y+1)/2;
                result+=2;
            }
        }
        result+= (X-Y);
        return result;
    }
}