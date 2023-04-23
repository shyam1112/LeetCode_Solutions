class Solution {
    public int reverse(int x) {

        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x=-x;
        }
        int i=0;
        long ans=0;
        while(x>0){
            int num=x%10;
            ans=ans*10+num;
            x=x/10;
        }

        if(ans>Integer.MAX_VALUE){
            return 0;
        }
        return (int)(isNegative ? -ans:ans);

    }
}
