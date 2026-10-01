class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int sMap[]=new int[26];
        int tMap[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            sMap[s.charAt(i)-'a']++;
            tMap[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(sMap,tMap)){
            return true;
        }
        return false;
    }
}