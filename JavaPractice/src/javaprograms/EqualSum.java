package javaprograms;
//https://practice.geeksforgeeks.org/problems/equal-sum/0/
/*Given an array A of length N. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of
the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
Formally, find an i, such that, A1+A2...Ai-1 =Ai+1+Ai+2...AN.


Input:

 The first line contains T, the number of test cases. For each test case, the first line contains N, the number of elements in the array A. The
second line for each test case contains N space-separated integers, denoting the array A.


Output:

For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the
elements on its right; otherwise print NO in a separate line.


Constraints:

1≤ T ≤ 30 
1≤ N ≤100000 
1≤ Ai ≤ 2×10000 
1≤ i ≤N


Example:

Input
1
4
1 2 3 3
Output:
YES
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.*;
class EqualSum {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];

			for(int i = 0; i < n ; i++)
			    if(sc.hasNext())
				    arr[i] = sc.nextInt();
			if(equilibrium(arr, n)==-1)
				System.out.println("NO");
			else
				System.out.println("YES");

		}
	}
	static int equilibrium(int arr[], int n) {
		int leftSum = 0;
		int sum = 0;
		for(int i = 0 ; i< n ;i++) {
			sum += arr[i];
		}
		for (int i=0;i<n;i++) {
			sum -= arr[i];
			if(leftSum == sum)
				return i;
			leftSum+=arr[i];
		}
		return -1;	
	}
//	public static String equalSumAtAnyIndex(int[] arr) {
//		int len = arr.length;
//		for(int i = 0; i< len;i++) {
//			if(arrSum(arr, 0 , i, 0)==arrSum(arr,i+1, len, 0)) {
//				return "YES";
//			}
//
//		}
//		return "NO";
//
//	}
//	public static int arrSum(int[] array, int startIndex, int size, int sum ) {
//
//		if(size==startIndex)
//			return sum;
//		return arrSum(array,startIndex, size-1, sum + array[size-1]);
//	}
}