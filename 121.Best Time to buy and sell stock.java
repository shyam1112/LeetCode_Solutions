class Solution {
    public int maxProfit(int[] arr) {
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         int profit=arr[j]-arr[i];
        //         if(sum<profit){
        //             sum=profit;
        //         }
        //     }
        // }
        // return sum;
        int maxprofit=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            int profit=arr[i]-min;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
