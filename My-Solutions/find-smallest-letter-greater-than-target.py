class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:        
        low , high  = 0 , len(letters)
        
        while low<=high:
            mid = (low+high)//2
            if mid == len(letters):
                return letters[0]
            if ord(target) < ord(letters[mid]) and ord(letters[mid-1]) <= ord(target):
                return letters[mid]   
            elif ord(target) >= ord(letters[mid]):
                low = mid +1
            else:
                high = mid-1
                
        
        return letters[0]