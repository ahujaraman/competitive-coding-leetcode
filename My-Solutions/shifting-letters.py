class Solution:
    def shiftingLetters(self, S: str, shifts: List[int]) -> str:
        presum = [shifts[0]]
        
        for i in range(1,len(shifts)):
            presum.append(presum[i-1]+shifts[i])
        
        result,overall = "",presum[-1]
        result += chr(((ord(S[0]) - 97 + overall)%26)+97)
        for i in range(1,len(S)):
            val = overall - presum[i-1]
            result+= chr(((ord(S[i]) - 97 + val)%26)+97)
        
        return result