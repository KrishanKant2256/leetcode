class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int small=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].length()<small)
            {
                small=strs[i].length();
            }
        }
        for(int i=0;i<small;i++)
        {
            String s=strs[0].substring(0,i+1);
            for(int j=1;j<strs.length;j++)
            {
                if(!strs[j].substring(0,i+1).equals(s))
                {
                    s=strs[0].substring(0,i);
                    return s;
                }
            }
        }
        return strs[0].substring(0, small);
    }
}