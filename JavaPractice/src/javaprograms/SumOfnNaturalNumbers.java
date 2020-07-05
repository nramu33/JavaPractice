package javaprograms;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		System.out.println(sum(n));

	}
	static int sum(int n) {
		return n*(n+1)/2;
		
	}

}
