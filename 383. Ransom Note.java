import java.util.HashMap;

class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : m.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map.toString());
        for (char ch : r.toCharArray()) {
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                if (count > 0) {
                    map.put(ch, count - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        
        return true;
    }
}
