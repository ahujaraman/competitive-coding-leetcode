class Solution:
    def isIdealPermutation(self, a: List[int]) -> bool:
        
        for i in range(len(a)):
            if abs(a[i]-i)>1:
                return False
        return True