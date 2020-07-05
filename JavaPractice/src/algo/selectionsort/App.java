package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {2,5,1,8,4,26,17});
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}

	//Start from the the beginning, Compare with the next elements in the array
		//--> if(next element is smaller)-->we will get new minimum
	//At the end of each outer  iteration swap the starting element with the minimum
	private static int[] selectionSort(int[] a) {
		
		int n = a.length;
		for(int i = 0; i < n;i++) {
			int minimum =i;
			for(int j = i+1; j < n; j++) {
				if(a[j] < a[minimum]) {
					minimum = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;
	}

}
