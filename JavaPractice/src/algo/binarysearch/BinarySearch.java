package algo.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr, 15));
		System.out.println(binarySearch(arr, 5));
	}
	
	public static int binarySearch(int[] a,int x) {
		int p = 0;
		int r = a.length-1;
		while(p <= r) {
			int q = (p+r)/2;
			if(x < a[q]) r = q-1;
			else if( x > a[q]) p = q+1;
			else return q;	
		}
		
		return -1;
	}
	public static int binarySearchRecursive(int[] a,int x) {
		return -1;
	}

}
