class Solution {
    public int trap(int[] height) {
        int i=0;
        int vol=0;
        while(i<height.length)
        {
            if(height[i]==0)
            {
                i++;
                continue;
            }
            int j=-1;
            int max=-1;
            for(int k=i+1;k<height.length;k++)
            {
                if(max==-1 || height[k]>height[max])
                {
                    max=k;
                }
                if(height[k]>=height[i])
                {
                    j=k;
                    break;
                }
            }
            if(j==-1)
            {
                j=max;
            }
            if(j==-1)
            {
                break;
            }
            int level=Math.min(height[i],height[j]);
            for(int k=i+1;k<j;k++)
            {
                if(level>height[k])
                {
                    vol+=level-height[k];
                }
            }
            i=j;
        }
        return vol;
    }
}