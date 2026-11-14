
class Solution {
    public int minimumSumSubarray(List<Integer> nums,int l,int r) {
        int lowSum=Integer.MAX_VALUE;

        for(int i=0;i<nums.size();i++) {
            int sum=0;
            for(int j=i;j<nums.size()&&j-i+1<=r;j++) {
                sum+=nums.get(j);
                int len=j-i+1;
                if(len>=l&&sum>0) {
                    lowSum=Math.min(lowSum,sum);
                }
            }
        }
        return lowSum==Integer.MAX_VALUE?-1:lowSum;
    }
}
