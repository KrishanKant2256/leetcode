class Solution{
    public int[] sumZero(int n){
        int[] ans=new int[n];
        int i=0;
        if(n%2==1) ans[i++]=0;
        int j=1;
        while(i<n){
            ans[i++]=j;
            ans[i++]=-j;
            j++;
        }
        return ans;
    }
}