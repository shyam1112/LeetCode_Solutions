class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] count={0};
        return f(0,nums,0,count,target);
    }
     public static int f(int ind,int[] a,int sum,int[] count,int target){
        if(ind==a.length){
            if(sum==target){
                count[0]++;
            }
            return count[0];
        }

        f(ind+1,a,sum+a[ind],count,target);
        f(ind+1,a,sum-a[ind],count,target);
        return count[0];
    }
}
