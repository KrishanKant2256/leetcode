class Solution {
    public String mergeAlternately(String word1,String word2) {
        char[] a=word1.toCharArray();
        char[] b=word2.toCharArray();
        char[] ans=new char[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length||j<b.length) {
            if(i<a.length) {
                ans[k]=a[i];
                i++;
                k++;
            }
            if(j<b.length) {
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        return new String(ans);
    }
}