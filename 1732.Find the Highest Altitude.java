class Solution {
    public int largestAltitude(int[] gain) {
       int ans =0;
        int alt=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            // System.out.println("alt :"+alt);
            if(ans<alt){
                ans=alt;
                // System.out.println("ans :"+ans);
            }
        }
        return ans;
    }
}
