class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();

        for(String str:strs){
            char[] charr=str.toCharArray();
            Arrays.sort(charr);
            String sorted=new String(charr);

            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());
            }
            map.get(sorted).add(str);
        }

        return new LinkedList<>(map.values());
    }
}
