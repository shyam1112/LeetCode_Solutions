class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;

        char startchar;
        char endchar;

        while(start<end){
            
            startchar=s.charAt(start);
            endchar=s.charAt(end);

            if(!Character.isLetterOrDigit(startchar)){
                start++;
            }
            else if(!Character.isLetterOrDigit(endchar)){
                end--;
            }else if(Character.toLowerCase(startchar)!= Character.toLowerCase(endchar)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
     
    }
}
