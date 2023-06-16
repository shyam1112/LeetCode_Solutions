class Solution {
    public boolean isValid(String s) {
        int i=0;
        Stack<Character> stack = new Stack<>();

        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
                i=i+1;
            }else{
              if (stack.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == ')' && stack.pop() != '(') {
                    return false;
                }
                if (s.charAt(i) == '}' && stack.pop() != '{') {
                    return false;
                }
                if (s.charAt(i) == ']' && stack.pop() != '[') {
                    return false;
                }
                i++;
            }
        }
        return stack.isEmpty();
    }
}
