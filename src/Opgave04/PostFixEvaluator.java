package opgave04;

import java.util.Stack;

public class PostFixEvaluator {
    public int evaluate(String input) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = input.split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else if (token.matches("[+\\-*/]")) {
                if (stack.size() < 2) {
                    throw new RuntimeException("Invalid postfix expression");
                }
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    default:
                        throw new RuntimeException("Unknown operator: " + token);
                }
            } else {
                throw new RuntimeException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Invalid postfix expression");
        }

        return stack.pop();
    }
}