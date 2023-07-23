class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int count=0;
        while(s<e){
            int sum=nums[s]+nums[e];
            if(sum<k){
                s++;
            }else if(sum>k){
                e--;
            }else{
                count++;
                s++;
                e--;
            }
        }
        return count;
    }
}
