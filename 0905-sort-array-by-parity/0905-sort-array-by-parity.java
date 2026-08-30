class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int start=0;
        int end=nums.length-1;
        int ans[]=new int[nums.length];
        while(i<nums.length)
        {
            if(nums[i]%2==0)
            {
                ans[start]=nums[i];
                start++;
            }
            else
            {
                ans[end]=nums[i];
                end--;
            }
            i++;
        }
        return ans;
    }
}