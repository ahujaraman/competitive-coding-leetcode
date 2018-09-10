class Solution {
    public int[] plusOne(int[] digits) {
        
        int original = 0;
        int check_other = 0;
        
        for(int i= 0; i < digits.length; i++){
            
            if(digits[i] !=9) check_other=1;
        }
       
        if(check_other == 0){
            int[] result_array = new int[digits.length +1];
            result_array[0] = 1;
            for(int i = 1; i<= digits.length;i++){
                result_array[i] = 0;
            }
            return result_array;
        }
        else{
                int size = digits.length;
                int[] result_array = new int[size];
                int carry_over = 1;


                for(int i = size -1; i>=0; i--){
                    if(digits[i] + carry_over == 10){
                        result_array[i] = 0;
                        carry_over = 1;
                    }
                    else{
                            result_array[i] = digits[i] + carry_over;
                            carry_over = 0;
                    }
                }
            return result_array;
        } 
    }
}
