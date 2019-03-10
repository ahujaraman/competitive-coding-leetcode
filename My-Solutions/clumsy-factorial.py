class Solution(object):
    def clumsy(self, N):
        """
        :type N: int
        :rtype: int
        """
        def calculate(s):
            if not s:
                return "0"
            stack, num, sign = [], 0, "+"
            for i in xrange(len(s)):
                if s[i].isdigit():
                    num = num*10+ord(s[i])-ord("0")
                if (not s[i].isdigit() and not s[i].isspace()) or i == len(s)-1:
                    if sign == "-":
                        stack.append(-num)
                    elif sign == "+":
                        stack.append(num)
                    elif sign == "*":
                        stack.append(stack.pop()*num)
                    else:
                        tmp = stack.pop()
                        if tmp//num < 0 and tmp%num != 0:
                            stack.append(tmp//num+1)
                        else:
                            stack.append(tmp//num)
                    sign = s[i]
                    num = 0
            return sum(stack)
        
        string = ""
        operator = ['*','/','+','-']
        i=0
        while N:
            string+=str(N)
            if N !=1:
                string+= operator[i%4]
            N-=1
            i+=1
        
        return calculate(string)
            
            
        
        
        