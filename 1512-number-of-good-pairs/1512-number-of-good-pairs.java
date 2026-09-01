class Solution{
    public int numIdenticalPairs(int[] nums){
        int[] count=new int[101];
        int gp=0;
        for(int x:nums){
            gp+=count[x];
            count[x]++;
        }
        return gp;
    }
}