class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        int minEven=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2!=0)
            {
                if(nums1[i]<minOdd)
                {
                    minOdd=nums1[i];
                    count++;
                }
            }
            else
            {
                if(nums1[i]<minEven)
                {
                    minEven=nums1[i];
                }
            }
        }
        if(count!=0)
        {
            return minOdd<minEven;
        }
        return true;
    }
}