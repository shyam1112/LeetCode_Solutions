class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int s = dp[i - 1][j];
                int ld = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int rd = (j < m - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE;
                dp[i][j] = matrix[i][j] + Math.min(s, Math.min(ld, rd));
            }
        }

        int mini = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            mini = Math.min(mini, dp[n - 1][j]);
        }

        return mini;
    }
}
