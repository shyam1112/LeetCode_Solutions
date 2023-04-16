class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int first=search(nums,target,true);
        int second=search(nums,target,false);
        
        ans[0]=first;
        ans[1]=second;
        return ans;

    }
    static int search(int[] nums,int target,boolean startindex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans=mid;
                if(startindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
