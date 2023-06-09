class Solution {
    public void rotate(int[] arr, int k) {
        k %= arr.length;
       reverse(arr,0,arr.length-1);
       reverse(arr,0,k-1);
       reverse(arr,k,arr.length-1);

    }
        public void reverse(int[] arr, int s, int l) {
            while(s<l){
                swap(arr,s++,l--);
            }
            
        }

        public void swap(int[] arr,int s,int l){
            int temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
        }


    
}
