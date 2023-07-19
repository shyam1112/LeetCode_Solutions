class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int x=candies[i]+extraCandies;
            if(x>=max){
                list.add(list.size(),true);
            }else{
                list.add(list.size(),false);
            }
        }
        return list;
    }
}
