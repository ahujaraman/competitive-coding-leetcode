'''
Recursive Solution
'''

class Solution:
    def baseNeg2(self, N: int) -> str:
        if N == 0 or N == 1:
            return str(N)
        return self.baseNeg2(-(N >>1)) + str(N&1)
		
		

'''
Iterative Solution
'''

class Solution:
    def baseNeg2(self, N: int) -> str:
        result = []
        
        while N:
            result.append(N&1)
            N = - (N>>1)
        
        result = ''.join(map(str,result[::-1] or [0]))
        return result