class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()) {
            if(!st.isEmpty()&&Math.abs(st.peek()-c)==32) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder str=new StringBuilder();

        for(char c:st) {
            str.append(c);
        }

        return str.toString();
    }
}