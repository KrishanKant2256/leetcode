class Solution {
    public int firstUniqChar(String s) {
         for(int i=0;i<s.length();i++)
         {
            int flag=-1;
            char ch=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(ch==s.charAt(j) && j!=i)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==-1)
            {
                return i;
            }
         }
         return -1;
    }
}