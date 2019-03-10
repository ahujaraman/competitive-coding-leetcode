# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def bstFromPreorder(self, preorder):
        """
        :type preorder: List[int]
        :rtype: TreeNode
        """
        root = TreeNode(preorder[0])
        s = []
        s.append(root)
        
        for i in range(1,len(preorder)):
            temp = None
            
            while len(s) and preorder[i] > s[-1].val:
                temp = s.pop()
            
            if temp != None:
                temp.right = TreeNode(preorder[i])
                s.append(temp.right)
            else:
                temp = s[-1]
                temp.left = TreeNode(preorder[i])
                s.append(temp.left)
        
        return root