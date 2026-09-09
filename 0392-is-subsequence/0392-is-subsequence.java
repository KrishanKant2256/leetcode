class Solution {
    public boolean isSubsequence(String s, String t) {
        int point = 0;

        for (int i = 0; i < t.length(); i++) {
            if (point == s.length()) {
                return true;
            }

            if (t.charAt(i) == s.charAt(point)) {
                point++;
            }
        }

        return point == s.length();
    }
}