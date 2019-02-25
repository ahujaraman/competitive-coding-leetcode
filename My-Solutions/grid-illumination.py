class Solution:
    def gridIllumination(self, N: int, lamps: List[List[int]], queries: List[List[int]]) -> List[int]:
        
        def illuminate(i,j,row,col,diagonal1,diagonal2):
            col[j] = col[j]+1
            row[i] = row[i]+1
            diagonal1[i+j] = diagonal1[i+j]+1
            diagonal2[j-i] = diagonal2[j-i]+1
            
            
        
        
        def switch_off_lamp(i,j,row,col,diagonal1,diagonal2):
            col[j] = col[j]-1
            row[i] = row[i]-1
            diagonal1[i+j] = diagonal1[i+j]-1
            diagonal2[j-i] = diagonal2[j-i]-1
        
        

        lamps_position = set()
        row = collections.defaultdict(int)
        col = collections.defaultdict(int)
        diagonal1 = collections.defaultdict(int)
        diagonal2 = collections.defaultdict(int)
        
        for x,y in lamps:
            illuminate(x,y,row,col,diagonal1,diagonal2)
            lamps_position.add((x,y))

        result = [0]*len(queries)
        edges = [[0,0],[-1,-1],[-1,1],[1,-1],[1,1],[0,-1],[0,1],[1,0],[-1,0]]
        cur = 0
        for x,y in queries:
            if col[y] >0 or row[x] >0 or diagonal1[x+y]>0 or diagonal2[y-x] >0:
                result[cur]=1
            
            if len(lamps_position)>0:   
                for dir_x,dir_y in edges:
                        r,c = x+dir_x,y+dir_y
                        if (r,c) in lamps_position:
                            switch_off_lamp(r,c,row,col,diagonal1,diagonal2)
                            lamps_position.remove((r,c))
                
            else:
                return result
            cur+=1
    
        
        return result
            