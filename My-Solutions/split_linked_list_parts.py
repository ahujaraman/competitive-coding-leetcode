# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def splitListToParts(self, root, k):
        """
        :type root: ListNode
        :type k: int
        :rtype: List[ListNode]
        """
        n, cur = 0, root
        while cur:
            cur = cur.next
            n+=1
        actual = n//k
        remaning = n%k
        result = []
        for i  in range(k):
            val = actual
            if remaning>0:
                val += 1
                remaning-=1
            result.append(root)
            prev = root
            while val>0:
                if root != None:
                    prev = root
                    root = root.next
                val-=1
            if prev:
                prev.next = None
        return result
