class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len=grid.length-2;
        int[][] ans= new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                for(int iInner=i;iInner<=i+2;iInner++){
                    for(int jInner=j;jInner<=j+2;jInner++){
                        ans[i][j]=Math.max(ans[i][j],grid[iInner][jInner]);
                    }
                }
            }
        }
        return ans;
    }
}
