package Lesson14;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        String s = "[asd{fgh(jkl)lkjhg}fdsa]";
        System.out.println(isCorrect(s));
    }

    private static boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '('){
                stack.push(c);
                continue;
            }
            switch (c){
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
