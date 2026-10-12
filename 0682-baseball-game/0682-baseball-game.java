class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int a = st.pop();
                int b = st.pop();

                st.push(b);
                st.push(a);
                st.push(a + b);
            }
            else if (s.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (s.equals("C")) {
                st.pop();
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}
