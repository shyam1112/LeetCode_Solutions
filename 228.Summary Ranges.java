class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> list=new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int first=nums[0];
        int i=0;
        while(i<nums.length-1){
        
       
        if(nums[i]+1==nums[i+1]){
            i++;
        }else if(first==nums[i]){
            list.add(Integer.toString(nums[i]));
            i++;
            first=nums[i];
        }
        else{
            list.add(first+"->"+nums[i]);
            i++;
            first=nums[i];
        }
        }
        if(first==nums[i]){
            list.add(Integer.toString(nums[i]));
        }else{
            list.add(first+"->"+nums[i]);
        }
       
        return list;
        }
    }
