import java.util.Stack;

public class No7_ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == '[' || c[i] == '{')
				stack.push(c[i]);
			else if (c[i] == ')') {
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
			} else if (c[i] == ']') {
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
			} else if (c[i] == '}') {
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(new No7_ValidParentheses().isValid("){"));
	}
}