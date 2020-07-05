package javaprograms;

/*package whatever //do not write package name here */

import java.io.*; 
import java.util.Scanner;

class Josephus { 

	static int josephus(int n, int k) 
	{ 
		if (n == 1) 
			return 1; 
		else
			/* The position returned by josephus(n - 1, k)  
    is adjusted because the recursive call  
    josephus(n - 1, k) considers the original  
    position k%n + 1 as position 1 */
			return ((josephus(n - 1, k) + k-1) % n + 1); 
	} 

	// Driver Program to test above function 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int n = 0, k = 0;
			n = sc.nextInt();
			k = sc.nextInt();

			System.out.println(josephus(n,k));
		}
	} 
}