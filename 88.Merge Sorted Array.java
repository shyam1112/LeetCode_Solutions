class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s1=0;
        int s2=0;
        int i=0;
        while(s1<m && s2<n){
            if(nums1[s1]>nums2[s2]){
                int temp=nums2[s2];
                nums2[s2]=nums1[s1];
                nums1[s1]=temp;
                Arrays.sort(nums2);
                s1++;
            }else{
                s1++;
            }
            i++;
        }
        while(s2<n){
            nums1[i]=nums2[s2];
            s2++;
            i++;
        }
    }
}
