class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Arrays.sort(gifts);
        int len=gifts.length;
        // int[] arr=new int[k];
        for(int i=0;i<k;i++){
            Arrays.sort(gifts);
            int x=gifts[len-1];
            gifts[len-1]=(int)Math.sqrt(x);

        }
        long sum=0;
        for(int i=0;i<gifts.length;i++){
            sum+=gifts[i];
            // System.out.println(arr[i]);
        }

        // if(sum<Integer.MIN_VALUE){
        //     return Integer.MIN_VALUE;
        // }else if(sum>Integer.MAX_VALUE){
        //     return Integer.MAX_VALUE;
        // }else{

        return sum;
        // }
    }
}
