class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;

                if (depth > 1) {
                    ans += c;
                }
            } else {
                depth--;

                if (depth > 0) {
                    ans += c;
                }
            }
        }

        return ans;
    }
}