class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length)
        {
            int count=0;
            char cur=chars[i];
            while(i<chars.length && chars[i]==cur)
            {
                count++;
                i++;
            }
            chars[index++]=cur;
            if(count>1)
            {
                String str=String.valueOf(count);
                for(char c:str.toCharArray())
                {
                    chars[index++]=c;
                }
            }
        }
        return index;
    }
}