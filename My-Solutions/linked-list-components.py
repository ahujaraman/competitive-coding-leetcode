# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def numComponents(self, head: ListNode, G: List[int]) -> int:
        components = set(G)
        result = 0
        
        while head != None:
            if head.val in components and (head.next == None or head.next.val not in components):
                result+=1
            head = head.next
        
        return result