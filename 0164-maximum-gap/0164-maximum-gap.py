class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        nums.sort()
        if len(nums)<2:
            return 0
        gap=0
        for i in range(len(nums)-1):
            temp=nums[i+1]-nums[i]
            if temp>gap:
                gap=temp
        return gap