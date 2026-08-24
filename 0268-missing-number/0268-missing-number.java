class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=nums[i]+sum;
        }
        for(int i=1;i<nums.length+1;i++)
        {
            s=s+i;
        }
        return s-sum;
    }
}