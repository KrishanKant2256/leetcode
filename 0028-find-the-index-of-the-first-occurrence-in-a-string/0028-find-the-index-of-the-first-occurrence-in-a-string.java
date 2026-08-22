class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(haystack.length()>=i+needle.length())
                {
                String part=haystack.substring(i,i+needle.length());
                if(part.equals(needle))
                {
                    return i;
                }}
            }
        }
        return -1;
    }
}