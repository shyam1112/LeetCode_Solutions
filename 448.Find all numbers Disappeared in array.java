class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;

        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
    return ans;
    }
    static void swap(int[] arr,int i,int current){
            int temp=arr[i];
            arr[i]=arr[current];
            arr[current]=temp;
    }
}
