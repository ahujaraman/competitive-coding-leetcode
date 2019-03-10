class Solution(object):
    def largestSumAfterKNegations(self, A, K):
        heapq.heapify(A)
        while K>0:
            min_element = heapq.heappop(A)
            heapq.heappush(A,-1*min_element)
            K-=1
        
        return sum(A)
            