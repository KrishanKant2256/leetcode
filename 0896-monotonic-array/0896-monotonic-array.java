class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flagIncrease=true;
        boolean flagDecrease=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flagIncrease=false;
            }
            else if(nums[i]<nums[i+1])
            {
                flagDecrease=false;
            }
        }
        if(flagDecrease==true || flagIncrease==true)
        {
            return true;
        }
        else 
        return false;
    }
}