class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=0;
        int max=0;
        for(int i=1;i<n;i++) {
            if(nums[i]<nums[min])
                min=i;

            if(nums[i]>nums[max])
                max=i;
        }
        int i=Math.min(min,max);
        int j=Math.max(min,max);

        int front=j+1;
        int back=n-i;
        int both=i+1+n-j;

        return Math.min(front,Math.min(back,both));
    }
}