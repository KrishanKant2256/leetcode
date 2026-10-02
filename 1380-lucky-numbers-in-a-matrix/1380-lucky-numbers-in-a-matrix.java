class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++) {
            int min=matrix[i][0];
            int col=0;

            for(int j=1;j<n;j++) {
                if(matrix[i][j]<min) {
                    min=matrix[i][j];
                    col=j;
                }
            }

            boolean isMax=true;

            for(int j=0;j<m;j++) {
                if(matrix[j][col]>min) {
                    isMax=false;
                    break;
                }
            }

            if(isMax) {
                ans.add(min);
            }
        }

        return ans;
    }
}