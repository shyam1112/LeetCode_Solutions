class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        Set<List<Integer>> set= new HashSet<>();
        if (target > Long.MAX_VALUE || target < Long.MIN_VALUE) {
            return list;
        }
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int s=j+1;
                int e=n-1;
                while(s<e){
                    long sum=(long)nums[i]+nums[j]+nums[s]+nums[e];
                    if (sum > Long.MAX_VALUE) {
                        return list;
                    }
                    if(sum<target){
                        s++;
                    }else if(sum>target){
                        e--;
                    }
                    else{
                        List<Integer> sublist= new ArrayList<>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[s]);
                        sublist.add(nums[e]);
                        Collections.sort(sublist);
                        set.add(sublist);
                        s++;
                        e--;
                    }
                }
            }
        }
        list=List.copyOf(set);
        return list;
    }
}
