class Solution {
    public int firstStableIndex(int[] nums, int k) {
    
        int cur=0;
      
        for(int i=0;i<nums.length;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]<min)
                {
                    min=nums[j];
                }
            }
            for(int j=0;j<i+1;j++)
            {
                if(nums[j]>max)
                {
                    max=nums[j];
                }
            }
            cur=max-min;
            if(cur<=k)
            {
                return i;
            }
        }
        return -1;
    }
}