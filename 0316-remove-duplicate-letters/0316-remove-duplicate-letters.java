class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[256];
        boolean[] seen = new boolean[256];
        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        for (char ch : s.toCharArray()) {
            freq[ch]--;
            if (seen[ch]) continue;
            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch &&
                   freq[stack.charAt(stack.length() - 1)] > 0) {
                char removed = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);
                seen[removed] = false;
            }
            stack.append(ch);
            seen[ch] = true;
        }
        return stack.toString();
    }
}