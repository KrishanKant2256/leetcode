class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] ans = new char[s.length() + spaces.length];
        int i = 0;  
        int j = 0;  
        int k = 0;  
        while (i < s.length()) {
            if (j < spaces.length && i == spaces[j]) {
                ans[k] = ' ';
                k++;
                j++;
            }
            ans[k] = s.charAt(i);
            k++;
            i++;
        }
        return new String(ans);
    }
}