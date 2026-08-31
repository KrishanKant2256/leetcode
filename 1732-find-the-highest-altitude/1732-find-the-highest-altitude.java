class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int cur=0;
        for(int i=0;i<gain.length;i++)
        {
            cur+=gain[i];
            if(cur>high)
            high=cur;
        }
        return high;
    }
}