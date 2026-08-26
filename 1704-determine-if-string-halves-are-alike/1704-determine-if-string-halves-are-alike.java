class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels="aeiouAEIOU";
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(vowels.indexOf(s.charAt(i))!=-1) c1++;
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(vowels.indexOf(s.charAt(i))!=-1) c2++;
        }
        return c1==c2;
    }
}