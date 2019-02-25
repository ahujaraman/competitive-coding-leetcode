class Solution:
    def numRookCaptures(self, board: List[List[str]]) -> int:
        r,c = 0,0
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == 'R':
                    r,c = i,j
        result = 0
        u = r-1
        while u>=0 and (board[u][c] == '.' or board[u][c]=='p' or  board[u][c]=='P'):
            if(board[u][c]=='p'):
                result+=1
                break
            elif board[u][c]=='P':
                result+=1
            u-=1
            
        d = r+1
        while d<len(board) and (board[d][c] == '.' or board[d][c]=='p' or board[d][c]=='P'):
            if(board[d][c]=='p'):
                result+=1
                break
            elif board[d][c]=='P':
                result+=1
            d+=1
            
        l = c-1
        while l>=0 and (board[r][l] == '.' or board[r][l]=='p'  or board[r][l]=='P'):
            if(board[r][l]=='p'):
                result+=1
                break
            elif board[r][l]=='P':
                result+=1
            l-=1 
        
        right = c+1
        while right<len(board[0]) and (board[r][right] == '.' or board[r][right]=='p' or board[r][right]=='P'):
            if(board[r][right]=='p'):
                result+=1
                break
            elif (board[r][right]=='P'):
                result+=1
            right+=1
            
        return result