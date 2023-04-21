class Solution {
    public int findDuplicate(int[] nums) {  
        int ans=cyclic(nums);
        return ans;
    }
    static int cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int current=arr[i]-1;
                if(arr[i]!=arr[current]){
                    swap(arr,i,current);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr,int i,int current){
        int temp=arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}
