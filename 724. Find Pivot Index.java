class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum1=0;
            if(i>0){
                int x=i-1;
                while(x>=0){
                    sum1+=nums[x];
                    x--;
                }
            }
            int sum2=0;
            if(i<nums.length-1){
                int y=i+1;
                while(y<nums.length){
                    sum2+=nums[y];
                    y++;
                }
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}
