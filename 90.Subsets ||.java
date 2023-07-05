class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);

        return subset(arr);
    }
     public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int num=0;num<arr.length;num++){
            start=0;
            if(num>0 && arr[num]==arr[num-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int i=start;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(arr[num]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
