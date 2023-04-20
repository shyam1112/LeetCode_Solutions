class Solution {
    public int missingNumber(int[] nums) {
        int ans=cycle(nums);
        return ans;
    }

    static int cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int current=arr[i];
            if( arr[i]<arr.length && arr[i]!=arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }
        
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    } 
    static void swap(int[] arr,int i,int current){
        int temp=arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}
