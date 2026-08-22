class Solution {
    public void reverseString(char[] s) {
        char temp=' ';
        int right=0;
        int left=s.length-1;
        while(left>right)
        {
            temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            right++;
            left--;
        }
    }
}