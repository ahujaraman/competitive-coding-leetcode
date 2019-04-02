class Solution:
    def numEnclaves(self, a: List[List[int]]) -> int:
        def dfs(a,i,j):
            if 0<=i<len(a) and 0<=j<len(a[0]) and a[i][j]:
                a[i][j] = 0
                if i in (0,len(a)-1) or j in (0,len(a[0])-1):
                    self.valid = False
                return 1+ dfs(a,i-1,j) + dfs(a,i+1,j) + dfs(a,i,j-1) + dfs(a,i,j+1)
            return 0
        
        result = 0
        for i in range(len(a)):
            for j in range(len(a[0])):
                if a[i][j]:
                    self.valid = True
                    val = dfs(a,i,j)
                    if self.valid:
                        result+=val
        
        return result
        