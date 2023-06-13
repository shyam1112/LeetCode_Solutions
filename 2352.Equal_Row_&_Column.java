class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int k=0;
                for(;k<n;k++){
                    if(grid[i][k] != grid[k][j]){
                        break;
                    }
                }
                
                if(k==n){
                    ans++;
                }
            }
        }
        return ans;
    }
}
