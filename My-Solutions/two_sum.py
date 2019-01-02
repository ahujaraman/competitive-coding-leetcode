class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        result = []
        for i in range(len(nums)):
            if target-nums[i] in map and map[target-nums[i]] != i:
                result.append(i)
                result.append(map[target-nums[i]])
                break
                return result
            else:
                map[nums[i]] = i
        return result
