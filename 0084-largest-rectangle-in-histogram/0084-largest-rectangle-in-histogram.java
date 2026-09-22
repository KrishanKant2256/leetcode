class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=-1;

        for(int i=1;i<n;i++) {
            int j=i-1;

            while(j>=0&&heights[j]>=heights[i]) {
                j=left[j];
            }

            left[i]=j;
        }

        right[n-1]=n;

        for(int i=n-2;i>=0;i--) {
            int j=i+1;

            while(j<n&&heights[j]>=heights[i]) {
                j=right[j];
            }

            right[i]=j;
        }

        int max=0;

        for(int i=0;i<n;i++) {
            int width=right[i]-left[i]-1;
            int area=heights[i]*width;

            if(area>max) {
                max=area;
            }
        }

        return max;
    }
}