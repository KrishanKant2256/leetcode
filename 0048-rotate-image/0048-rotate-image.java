class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int start = 0;
        int end = matrix.length - 1;
        while (start < end) {
            int t[] = new int[n];
            t = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = t;
            start++;
            end--;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i > j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
            }
        }     
    }
}