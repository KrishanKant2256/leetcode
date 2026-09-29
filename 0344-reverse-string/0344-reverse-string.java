class Solution {
    public void reverseString(char[] s) {
        
        int right=0;
        int left=s.length-1;
        while(left>right)
        {
            char temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            right++;
            left--;
        }
    }
}