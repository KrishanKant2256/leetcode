class Solution{
    public int firstStableIndex(int[] nums,int k){
        int[] minPrefix=new int[nums.length];
        int min=Integer.MAX_VALUE;
        int cur=0;
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            minPrefix[i]=min;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            cur=Math.abs(minPrefix[i]-max);
            if(cur<=k){
                return i;
            }
        }
        return -1;
    }
}