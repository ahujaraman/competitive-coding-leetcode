class Solution(object):
    def longestArithSeqLength(self, A):
        N = len(A)
        if not N:
            return 0
        if len(A) == 1:
            return 1 
        DP = collections.defaultdict(int)
        
        for i in range(1, N):
            for j in range(i):
                diff = A[j]-A[i]
                DP[(i, diff)] = max(DP[(j, diff)] + 1, DP[(i, diff)])
                
        return max(DP.values()) + 1