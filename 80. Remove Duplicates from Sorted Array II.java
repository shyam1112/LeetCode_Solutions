class Solution {
    public int removeDuplicates(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(i<2 || nums[i]>nums[num-2]){
                nums[num++]=nums[i];
            }
        }
        return num;
    }
}
