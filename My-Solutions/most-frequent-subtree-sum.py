# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def findFrequentTreeSum(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if not root:
            return []
        self.h_map = {}
        def dfs(node):
            if not node:
                return 0
            left = dfs(node.left)
            right = dfs(node.right)
            self.h_map[left+right+node.val] = self.h_map.get(left+right+node.val,0)+1
            return node.val + left + right
        
        dfs(root)
        tuples = [(-1*v,k) for k,v in self.h_map.items()]
        heapq.heapify(tuples)
        max = tuples[0][0]
        result = []
        while tuples and tuples[0][0]==max:
            val,key = heapq.heappop(tuples)
            result.append(key)
        return result
