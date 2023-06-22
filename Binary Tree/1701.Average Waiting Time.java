class Solution {
    public double averageWaitingTime(int[][] cus) {
        int divide = cus.length;
        long sum=0;
        long time=0;
        for(int i=0;i<cus.length;i++){
            if(i==0){
                time=cus[0][0];
            }
            if(time<cus[i][0]){
                time=cus[i][0];
                time+=cus[i][1];
                sum+=time-cus[i][0];
            }else{
                time+=cus[i][1];
                sum+=time-cus[i][0];
            }
        }
        double ans=((double)(sum))/divide;

        return ans;
    }
}
