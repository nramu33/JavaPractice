package javaprograms;
import java.io.IOException;

public class LongestSubArray {

	int findSubArray(int arr[]) {
		int n =arr.length;
		int startIndex =0;
		int max_size=-1;
		int sum=0;
		for(int i=0;i<n-1;i++) {

			sum = (arr[i]==0)?-1:1;

			for(int j=i+1;j<n;j++) {
				if(arr[j]==0)
					sum+= -1;
				else
					sum+= 1;
				if(sum ==0 && max_size<j-i+1) {
					max_size = j-i+1;
					startIndex = i;
				}
			}

		}
		int endindex = startIndex+max_size-1;
		 if (max_size == -1) 
	            System.out.println("No such subarray"); 
	        else
	            System.out.println(startIndex + " to " + endindex); 
	  
	        return max_size; 

	}

	public static void main(String[] args) throws IOException {
		int[] arr = {0,1,0,1,1,0,0,1};
		LongestSubArray l = new LongestSubArray();
		System.err.println(l.findSubArray(arr));


	}
}

