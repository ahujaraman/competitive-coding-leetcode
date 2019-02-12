class Solution:
    def rob(self, nums: 'List[int]') -> 'int':
        if len(nums)==0:
            return 0
        dp = [0]*(len(nums)+2)
        dp[2] = nums[0]
        k = 3
        for i in range(1,len(nums)):
            dp[k] = max(dp[k-2],dp[k-3])+nums[i]
            k+=1
        return max(dp)
