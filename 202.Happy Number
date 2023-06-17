class Solution {
    public boolean isHappy(int n) {
          int first=n;
          int second=n;

          do{
              first=sqr(first);
              second=sqr(sqr(second));
          }while(first!=second);

          if(first==1){
              return true;
          }
          return false;
    }
    public static int sqr(int x){
        int ans=0;
            while(x>0){
                int a=x%10;
                ans+=a*a;
                x=x/10;
            }
        return ans;
    }
}
