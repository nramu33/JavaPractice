package javaprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PrintArrayList2 {

	public static void main(String[] args) {
		List<String> al= new ArrayList<String>();
		String[] str= {"Ramu","Sai","Santu","Anil","Venky"};
		al= Arrays.asList(str);
		ListIterator<String> li= al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
