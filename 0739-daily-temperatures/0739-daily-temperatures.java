class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        for(int i=temperatures.length-2;i>=0;i--)
        {
            int j=i+1;
            while(j<temperatures.length&&temperatures[j]<=temperatures[i])
            {
                if(ans[j]==0)
                {
                    j=temperatures.length;
                }
                else
                {
                    j=j+ans[j];
                }
            }
            if(j<temperatures.length)
            {
                ans[i]=j-i;
            }
        }
        return ans;
    }
}