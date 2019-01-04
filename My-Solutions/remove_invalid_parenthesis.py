class Solution:
    def removeInvalidParentheses(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        def isValid(s):
            count = 0
            for x in s:
                if x == '(':
                    count+=1
                elif x ==')':
                    count-=1
                if count < 0:
                    return False
            return True if count==0 else False
        
        level = {s}
        while True:
            valid = list(filter(isValid,level))
            if valid:
                return valid
            level = {s[:i] + s[i+1:] for s in level for i in range(len(s))}
