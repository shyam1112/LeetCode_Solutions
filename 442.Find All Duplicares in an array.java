class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
                int current=arr[i]-1;
                if(arr[i]!=arr[current]){
                    swap(arr,i,current);
                }else{
                    i++;
                }
        }
        List<Integer> list=new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                list.add(arr[index]);
            }
        }

        return list;
    }
    static void swap(int[] arr,int i,int current){
        int temp=arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}
