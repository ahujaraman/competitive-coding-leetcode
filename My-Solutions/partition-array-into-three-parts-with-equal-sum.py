class Solution:
    def canThreePartsEqualSum(self, arr: List[int]) -> bool:
        n = len(arr)
        preSum = 0
 
        ind1 = -1 
        ind2 = -1
        S = arr[0] 
        for i in range(1, n): 
            S += arr[i] 

        if(S % 3 != 0): 
            return False

        S1 = S // 3 

        for i in range(0,n): 
            preSum += arr[i] 
            if (preSum == S1 and ind1 == -1): 
                ind1 = i
                preSum = 0
            elif(preSum == S1 and ind2==-1): 
                ind2 = i
                preSum = 0
        
        if preSum != S1:
            return False
        
        if (ind1 != -1 and ind2 != -1):
            return True

        return False
