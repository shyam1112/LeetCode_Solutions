class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String f=strs[0];
        String l=strs[strs.length-1];
        int index=0;

        while(index<strs[0].length()){

          if(f.charAt(index)==l.charAt(index)){
            index++;
          }else{
            break;
          }
        }

        return index==0?"":f.substring(0,index);
    }
}
