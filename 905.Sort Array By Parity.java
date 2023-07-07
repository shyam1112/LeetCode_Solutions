class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int s=0;
       int e=nums.length-1;
       while(s<e){
           while(nums[s]%2==0){
                if(s<e){
                    s++;
                }else{
                    break;
                }
           }
           while(nums[e]%2!=0){
               if(s<e){
                    e--;
                }else{
                    break;
                }
           }
           if(s<e){
               int temp=nums[s];
               nums[s]=nums[e];
               nums[e]=temp;
               s++;
               e--;
           }
       } 
       return nums;
    }
}
