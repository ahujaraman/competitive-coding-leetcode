class Solution:
    def prefixesDivBy5(self, A: List[int]) -> List[bool]:
        result = [False]*len(A)
        val = 0
        for i in range(len(A)):
            val = 2*val + A[i]
            if val%5 == 0:
                result[i] = True
            val = val%5
        
        return result
            
            