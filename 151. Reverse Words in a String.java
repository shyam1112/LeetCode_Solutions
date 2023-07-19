class Solution {
    public String reverseWords(String string) {
        if(string.length()==0 || string.length()==1){
            return string;
        }
        string=string.trim().replaceAll(" +"," ");
        String str="";
        String[] arr=string.split(" ");
        
        int s=0;
        int e=arr.length-1;
        while(s<e){
            String temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        str+=arr[0];
        for(int i=1;i<arr.length;i++){
            str+=(" "+arr[i]);
        }
        return str;
    }
}
