class Solution(object):
    def numSubarrayProductLessThanK(self, nums, k):        
        i,j,result,prod,n = 0,0,0,1,len(nums)
        
        if k==0:
            return 0
        while j<n:
            prod= prod * nums[j]
            while i<=j and prod>=k:
                prod = prod//nums[i]
                i+=1
            result+=(j-i+1)
            j+=1
        return result