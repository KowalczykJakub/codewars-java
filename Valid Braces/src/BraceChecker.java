import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < braces.length(); i++) {

            char c = braces.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty() && (c == stack.peek() + 1 || c == stack.peek() + 2)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
