class Solution {
    public int maxArea(int[] height) {
        //starting point
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            //the lh=the height of the l array and rh=the height of the r
            int lh=height[l];
            int rh=height[r];
            int min_h=Math.min(lh,rh);
            int rr=r-l;
            int area=min_h*rr;
            max=Math.max(max,area);
            if(lh<rh){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
