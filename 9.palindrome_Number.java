class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        if(x<0){
            return false;
        }
       int number=x;
        while(x>0){
            int last=x%10;
            ans=ans*10+last;
            x=x/10;
            
        }
        
        return ans==number;
        
    }
}
