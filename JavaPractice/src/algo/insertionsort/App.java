package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = insertionSort(new int[] {2,5,17,8,4,26,15});
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}

	//We will achieve this by inserting element by element from Unsorted Section to sorted section
	//Start by considering first element is sorted and rest of the array is unsorted
	//Compare the "first element of Unsorted" with "the elements of sorted array" from right to left -->and swap accordingly
	private static int[] insertionSort(int[] a) {
		
		for(int i = 1; i < a.length;i++) {//we will start from i=1 since we assume the first element is sorted in the beginning
			int element = a[i]; //element variable contains the data we intend on bringing over the sorted area
			int j = i-1;
			while(j >= 0 && a[j] > element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}

}
