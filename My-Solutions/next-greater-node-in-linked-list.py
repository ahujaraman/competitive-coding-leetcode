# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def nextLargerNodes(self, head: ListNode) -> List[int]:
        cur = head
        stack,result = [] , []
        if not head:
            return result
        while cur != None:
            while len(stack) and stack[-1].val < cur.val:
                node = stack.pop()
                node.val = cur.val
                
            stack.append(cur)
            cur = cur.next
        
        while len(stack):
            node = stack.pop()
            node.val = 0
        
        while head:
            result.append(head.val)
            head = head.next
        return result