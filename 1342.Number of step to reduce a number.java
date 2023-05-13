class Solution {
    public int numberOfSteps(int num) {
      
        return reducenum(num,0);
    }
    public static int reducenum(int n,int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return reducenum(n/2,s+1);
        }
            return reducenum(n-1,s+1);        
    }
}
