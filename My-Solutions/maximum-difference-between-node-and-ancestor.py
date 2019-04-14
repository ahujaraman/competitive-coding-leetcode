# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def maxAncestorDiff(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
        _MIN = -2147483648
        _MAX = 2147483648
        
        def maxDiffUtil(t, res):
            if (t == None): 
                return _MAX,_MIN,res 
            
            if (t.left == None and t.right == None): 
                return t.val,t.val, res 

            a,a_max,res = maxDiffUtil(t.left, res) 
            b,b_max, res = maxDiffUtil(t.right, res) 
            val = min(a, b)
            val_max = max(a_max,b_max)
            cur_max = t.val - val_max
            cur = t.val - val
            
            if cur <0:
                cur = -1*cur
            if cur_max<0:
                cur_max = -1*cur_max
            
            res = max(res, max(cur,cur_max))
            
            return min(val, t.val),max(val_max,t.val), res
        
        res = _MIN 
        x,y, res = maxDiffUtil(root, res) 
        return res