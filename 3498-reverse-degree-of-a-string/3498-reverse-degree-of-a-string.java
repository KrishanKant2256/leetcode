class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for( int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int p=(i+1)*(('z'-ch)+1);
            sum+=p;
        }
        return sum;
    }
}