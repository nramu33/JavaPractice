package javaprograms;

import java.util.Stack;

public class BalancedParentheses {
	public static void main(String[] args) {
		String str = "{{(1[)}[]}";
		if(areParenthesisBalanced(str))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

	static boolean areParenthesisBalanced(String str){
		char exp[]=str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<exp.length;i++) {
			char current = exp[i];
			//Opening parenthesis then push into stack
			if(current=='{' || current=='(' || current=='[') {
				stack.push(exp[i]);
			}
			//Closing parenthesis
			if(current=='}' || current==')' || current==']') {
				//stack is empty means no corresponding opening parenthesis found before 
				if(stack.isEmpty())
					return false;
				//if Matching pair found pop the char from stack else return false
				else if(isMatchingPair(stack.peek(),current) )
					stack.pop();
				else
					return false;
			}
		}
		//Finally if stack is empty means 'Opening braces pushed' and 'closing parenthesis popped'
		if(stack.isEmpty())
			return true;
		else
			return false;

	}
	static boolean isMatchingPair(char current, char peak) {
		return (current=='{' && peak =='}' || current=='(' && peak ==')' || current=='[' && peak ==']');

	}
}
