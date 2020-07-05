package javaprograms;
import java.io.IOException;

public class LeftMostCharacterNotRepeating {

	public static void main(String[] args) throws IOException {
		String s="ramu";
		int res=-1;
		int fi[] = new int[256];//fi=First Index
		for(int i=0;i<256;i++) {
			fi[i]=-1;
		}
		for(int j=s.length()-1;j>=0;j--) {
			if(fi[s.charAt(j)]==-1) {
				fi[s.charAt(j)]=j;
				res=j;
			}
		}
		 
		System.out.println("Left Most Character Not Repeating is at:"+res);
		System.out.println("Left Most Character Not Repeating is :"+s.charAt(res));
	}
}

