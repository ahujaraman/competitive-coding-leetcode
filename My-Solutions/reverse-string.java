class Solution {
    public String reverseString(String s) {
        
        char[] charsequence = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        
        while(i<j)
        {
            char temp = charsequence[i];
            charsequence[i] = charsequence[j];
            charsequence[j] = temp;
            i++;
            j--;
        }
        return new String(charsequence);
    }
}
