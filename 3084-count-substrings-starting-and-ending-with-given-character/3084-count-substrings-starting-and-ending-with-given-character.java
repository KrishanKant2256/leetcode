class Solution {
    public long countSubstrings(String s, char c) {
        long freq=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==c){
                freq++;
            }
        }
        return freq*(freq+1)/2;
        //git// sync
    }
}