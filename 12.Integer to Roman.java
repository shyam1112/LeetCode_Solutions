class Solution {
    public String intToRoman(int num) {
        String str="";
        String[] strlist={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] listint= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        int x=num;
        int i=0;
        while(x>0){
            while(x>=listint[i] && x>0){
                str+=strlist[i];
                x-=listint[i];
            }
            i++;
        }

        return str;

    }
}
