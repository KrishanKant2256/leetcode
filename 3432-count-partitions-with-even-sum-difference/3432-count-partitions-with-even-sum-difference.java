class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int count=0;
        int sum2=0;
        for(int j=0;j<nums.length-1;j++){
            sum2+=nums[j];
            if((sum2-(sum-sum2))%2==0){
                count++;
            }
        }
        return count;
    }
}