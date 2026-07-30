class Solution:
    def maxWidthRamp(self, nums: List[int]) -> int:
        stack=[0]
        for i in range(1,len(nums)):
            if nums[i]<nums[stack[-1]]:
                stack.append(i)
        ramp=0
        for j in range(len(nums)-1,-1,-1):
            while stack and nums[j]>=nums[stack[-1]]:
                ramp=max(ramp,j-stack[-1])
                stack.pop()
        return ramp