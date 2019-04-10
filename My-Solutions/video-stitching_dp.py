class Solution(object):
    def videoStitching(self, clips, T):
        """
        :type clips: List[List[int]]
        :type T: int
        :rtype: int
        """
        result = [101]*101
        result[0]=0
        for i in range(T+1):
            for x,y in clips:
                if i>x and i<=y:
                    result[i] = min(result[i],result[x]+1)
        
        if result[T]==101:
            return -1
        return result[T]