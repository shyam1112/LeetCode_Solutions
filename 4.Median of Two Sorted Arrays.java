class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int x=nums1.length;
       int y=nums2.length;
       int[] arr=new int[x+y];
        int i=0;
        int j=0;
        int k=0;
       while(i<x && j<y){

           if(nums1[i]<nums2[j]){
               arr[k]=nums1[i];
               i++;
               k++;
           }else{
               arr[k]=nums2[j];
               j++;
               k++;
           }
       }
       while(i<x){
           arr[k]=nums1[i];
               i++;
               k++;
       }
       while(j<y){
           arr[k]=nums2[j];
               j++;
               k++;
       }
       int z=arr.length/2;
       double ans=0.0;
       if(arr.length%2==0){
           ans=(double)(arr[z]+arr[z-1])/2;
       }else{
           ans=arr[z];
       }
       return ans; 
    }
}
