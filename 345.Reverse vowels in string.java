class Solution {
    public String reverseVowels(String str1) {
        StringBuilder str=new StringBuilder(str1);
        char[] arr= new char[10];
        arr[0]='a';
        arr[1]='e';
        arr[2]='i';
        arr[3]='o';
        arr[4]='u';
        arr[5]='A';
        arr[6]='E';
        arr[7]='I';
        arr[8]='O';
        arr[9]='U';
        System.out.println(Arrays.toString(arr));
        int s=0;
        int e=str1.length()-1;
        while(s<e){
            boolean b=false;
            
            while(b!=true && s<str.length()){
                for(int i=0;i<10;i++){
                    if(arr[i]==str.charAt(s)){
                        b=true;
                        break;
                    }
                }
                    if(b==false){
                        s++;
                    }
            }
            b=false;
            while(b!=true && e>=0){
                for(int i=0;i<10;i++){
                    if(arr[i]==str.charAt(e)){
                        b=true;
                        break;
                    }
                }
                    if(b==false){
                        e--;
                    }
            }
            if(s<e){
                char temp=str.charAt(s);
                str.setCharAt(s,str.charAt(e));
                str.setCharAt(e,temp);
                s++;
                e--;
            }
        }
        return str.toString();
    }
}
