class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] temp1=new int[nums.length-1];
        int[] temp2=new int[nums.length-1];
        List<Integer> list1= new ArrayList<Integer>();
        List<Integer> list2= new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(i!=0){
                list1.add(nums[i]);
            }
            if(i!=nums.length-1){
                list2.add(nums[i]);
            }
        }
        for(int i=0;i<list1.size();i++){
            temp1[i]=list1.get(i);
            temp2[i]=list2.get(i);
        }

        return (int)Math.max(house(temp1),house(temp2));
    }
    public static int house(int[] nums){
        int n=nums.length;
        int prev2=0;
        int prev=nums[0];
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int nottake=0+prev;
            int cur=(int)Math.max(take,nottake);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}
