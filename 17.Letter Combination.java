class Solution {
    public List<String> letterCombinations(String digits) {
        return combination("",digits);
    }
    private static final String[] LETTERS = {
        "",     // digit 0
        "",     // digit 1
        "abc",  // digit 2
        "def",  // digit 3
        "ghi",  // digit 4
        "jkl",  // digit 5
        "mno",  // digit 6
        "pqrs", // digit 7
        "tuv",  // digit 8
        "wxyz"  // digit 9
    };
    public static List<String> combination(String p, String up){
          if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            if (!p.isEmpty()) {
                list.add(p);
            }
            return list;
        }
        int digit = up.charAt(0)-'0';
        List<String> list=new ArrayList<>();
        String letters = LETTERS[digit];
         for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(combination(p + ch, up.substring(1)));
        }
        return list;
    }
}
