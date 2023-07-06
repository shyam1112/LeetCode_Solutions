import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int ans = 0;
        while (i < tokens.length) {
            if (tokens[i].matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (tokens[i]) {
                    case "*":
                        ans = a * b;
                        stack.push(ans);
                        break;
                    case "/":
                        ans = a / b;
                        stack.push(ans);
                        break;
                    case "+":
                        ans = a + b;
                        stack.push(ans);
                        break;
                    case "-":
                        ans = a - b;
                        stack.push(ans);
                        break;
                }
            }
            i++;
        }
        return stack.pop();
    }
}
