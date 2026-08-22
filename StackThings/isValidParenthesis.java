package StackThings;

import java.util.Stack;

public class isValidParenthesis {

    public static void main(String[] args) {

        char[] brackets = {'(', ')', '{', '}', '['};

        System.out.print(isValid(brackets));
    }

    private static boolean isValid(char[] bracket) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < bracket.length; i++) {

            char ch = bracket[i];

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {

                    stack.pop();

                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}