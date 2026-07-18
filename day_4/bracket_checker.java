
package day_4;

import java.util.Stack;

public class bracket_checker {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{'){
                stack.push('}');
            }
            else if(ch == '['){
                stack.push(']');
            }
            else if(ch == '('){
                stack.push(')');
            }
            else if (ch == '}' || ch == ']' || ch == ')'){
                if(stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[(]}";
        System.out.println(isBalanced(test1));
    }
}
