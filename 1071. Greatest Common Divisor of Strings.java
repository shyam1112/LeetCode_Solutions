class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s1=str1.concat(str2);
        String s2=str2.concat(str1);
         if(!s1.equals(s2)){
            return "";
        }
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
    public static int gcd(int x,int y){
        int gcd=1;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
