class Solution:
    def maxScoreSightseeingPair(self, a: List[int]) -> int:
        max_so_far,result = a[0],0
        
        for i in range(1,len(a)):
            result = max(result, a[i]+ max_so_far - i)
            max_so_far = max(max_so_far, a[i] + i)
        
        return result