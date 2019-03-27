# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def plusOne(self, head: ListNode) -> ListNode:
        def reverse(head):
            prev = None
            cur = head
            
            while cur!=None:
                cur_next = cur.next
                cur.next = prev
                prev = cur
                cur = cur_next
            return prev
        
        if head == None:
            return
        
        if head.next != None:
            head = reverse(head)
        
        carry,cur = 1,head
        while cur:
            carry+=cur.val
            digit = carry%10
            carry = carry//10
            cur.val = digit
            cur = cur.next
        
        if carry:
            node = ListNode(carry)
            node.next = head
            return node
        else:
            return reverse(head)
            
            