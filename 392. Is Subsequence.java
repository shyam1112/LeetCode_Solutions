class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int fir=0;
        int sec=0;
        while(fir<s.length() && sec<t.length()){
            if(s.charAt(fir)==t.charAt(sec)){
                fir++;
                count++;
            }
            sec++;
        }
        if(count==s.length()){
            return true;
        }
        return false;
    }
}
