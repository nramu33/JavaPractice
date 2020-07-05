package ds.stack;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		App myApp = new App();
		System.out.println(myApp.reverseString("Ramu"));
	}

	public String reverseString(String str) {
		int stackSize = str.length();
		Stack myStack = new Stack(stackSize);
		String reversedString ="";

		for(char ch:str.toCharArray()) {
			myStack.push(ch);
		}
		
		while(!myStack.isEmpty()) {
			char ch = myStack.pop();
			reversedString = reversedString+ch;
		}
		return reversedString;

	}

}
