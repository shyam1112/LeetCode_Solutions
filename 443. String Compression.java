class Solution {
    public int compress(char[] chars) {
        String str="";
        if(chars.length==1){
            return 1;
        }
        int count=1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }else{
                str+=chars[i];
                if(count>1){
                    str+=Integer.toString(count);
                }
                count=1;
            }
        }
        if(count==1){
            str+=chars[chars.length-1];
        }else{
            str+=chars[chars.length-1];
            str+=Integer.toString(count);
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
        return str.length();
    }
}
