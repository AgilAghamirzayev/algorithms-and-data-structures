package stack.and.queue;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (String token : tokens) {
            if("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                nums.push(getResult(token, nums.pop(), nums.pop()));
            } else {
                nums.push(Integer.parseInt(token));
            }
        }
        return nums.pop();
    }

    public int getResult(String operator, int b, int a) {
        switch (operator) {
            case "+": return a + b;
            case "/": return a / b;
            case "*": return a * b;
            case "-": return a - b;
        }
        return 0;
    }
}
