class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int n = words.length;
        String[] ans = new String[n];
        for (String word : words) {
            n--;
            ans[n] = word;
        }
        return String.join(" ", ans);
    }
}