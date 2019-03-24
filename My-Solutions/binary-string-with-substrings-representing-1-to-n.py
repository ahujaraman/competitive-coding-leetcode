class Solution:
    def queryString(self, S: str, N: int) -> bool:
        result = 0
        
        for i in range(1,N+1):
            binary = bin(i)
            if binary[2:] not in S:
                return False
        
        return True