/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray A) {
        int peak=0;
        int start=0;
        int end=A.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(A.get(mid)>A.get(mid+1)){
                end=mid;
                
            }else{
                start=peak=mid+1;

           }
        }
        start=0;
        end=peak;
        //find peak element
        while(start<=end){
            int mid=start+(end-start)/2;
            if(A.get(mid)<target){
                start=mid+1;
            }else if(A.get(mid)>target){
                end=mid-1;;
            }else{
                return mid;
            }
        }
     //search on both side
        start=peak;
        end=A.length()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(A.get(mid)<target){
                 end=mid-1;;
                
            }else if(A.get(mid)>target){
               start=mid+1;
            }else{
                return mid;
            }
        }
    return -1;
    }
}
