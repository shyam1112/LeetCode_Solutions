class Solution {
    public int divide(int dividend, int divisor) {
     
         if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        int ans = dividend/divisor;
        if(dividend <0 && divisor <0){
            ans=Math.abs(ans);
        }
        return ans;
    }
}
