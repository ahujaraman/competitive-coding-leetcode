class Solution:
    def advantageCount(self, A: List[int], B: List[int]) -> List[int]:
        A,n = sorted(A), len(A)
        result = [-1]*n
        not_found,visited = [],set()
        
        for i in range(n):
            val = B[i]
            index = bisect.bisect_right(A,val)
            while index < n:
                if index not in visited:
                    result[i] = A[index]
                    visited.add(index)
                    break
                index+=1
            if result[i]==-1:
                not_found.append(i)
        
        j = 0
        for i in range(n):
            if i not in visited:
                result[not_found[j]] = A[i]
                visited.add(i)
                j+=1
        
        return result
        
            
        
        
            