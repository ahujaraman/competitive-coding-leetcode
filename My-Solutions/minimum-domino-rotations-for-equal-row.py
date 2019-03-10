class Solution(object):
    def minDominoRotations(self, A, B):
        """
        :type A: List[int]
        :type B: List[int]
        :rtype: int
        """
        A_map = collections.Counter(A)
        B_map = collections.Counter(B)
        candidate, max_val,l = 0, 0,0
        
        for key,val in A_map.items():
            if val > max_val:
                max_val = val
                candidate = key
                l=1
                
        for key,val in B_map.items():
            if val > max_val:
                max_val = val
                candidate = key
                l=2
        
        result = 0
        if l==1:
            for i in range(len(A)):
                if A[i]!=B[i] and B[i]==candidate:
                    max_val+=1
                    result+=1
        
        if l==2:
            for i in range(len(A)):
                if A[i]!=B[i] and A[i]==candidate:
                    max_val+=1
                    result+=1
        
        if max_val == len(A):
            return result
        else:
            return -1
        
            
            
                