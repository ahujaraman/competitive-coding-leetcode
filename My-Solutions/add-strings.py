class Solution:
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        result = []
        i,j,carry = len(num1)-1,len(num2)-1,0
        
        while i>=0 and j>=0:
            cur = carry + int(num1[i]) + int(num2[j])
            i-=1
            j-=1
            digit = cur % 10
            result.append(digit)
            carry = cur //10
        if i>=0:
            while i>=0:
                cur = carry + int(num1[i])
                digit = cur % 10
                result.append(digit)
                carry = cur //10
                i-=1
        if j>=0:
            while j>=0:
                cur = carry + int(num2[j])
                digit = cur % 10
                result.append(digit)
                carry = cur //10
                j-=1
        if carry ==1:
            result.append(1)
        result.reverse()
        str_result = ''
        for x in result:
            str_result+=str(x)
        return str_result
