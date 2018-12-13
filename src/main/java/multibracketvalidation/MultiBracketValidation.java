package multibracketvalidation;


import stacksandqueues.Stack;

public class MultiBracketValidation {

    public static void main(String[] args) {
        String str = "{}{Code}[Fellows](())";

        System.out.println(multiBracketValidation(str));

    }

    public static boolean multiBracketValidation(String input) {
        Stack stack = new Stack();
        if (input.isEmpty()) {
            return true;
        }
        for (int i = 0; i < input.length(); i++) {
            char brackets = input.charAt(i);
            if (brackets == '(' || brackets == '{' || brackets == '[') {
                stack.push(brackets);
            }
              else if (brackets == ')') {
                if (stack.peek() == null || (char) stack.pop() != '(') {
                    return false;
                }
            } else if(brackets == '}') {
                if (stack.peek() == null || (char) stack.pop() != '{') {
                    return false;
                }
            } else if (brackets == ']') {
                if (stack.peek() == null || (char) stack.pop() != '[') {
                    return false;
                }
            }
        }


        return true;
    }
}

