package javaprograms;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class StackPractice {
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<Integer>();
		Stack<Integer> s3= new Stack<Integer>();
		System.out.println("Initial Capacity:"+s.capacity());
		for(int i=0;i<10;i++) {
			s.add(i);
			s3.add(i);
		}
//		System.out.println("Current Capacity:"+s.capacity());
//		System.out.println("Elemnt at index 4:"+s.get(4));
//		System.out.println("peek:"+s.peek());
//		System.out.println("Is Stack Contains 20? :"+s.contains(20));
//		System.out.println("poped item:"+s.pop());
//		System.out.println("Is Stack Contains 20 after pop? :"+s.contains(20));
//		Stack<Integer> s2 = (Stack<Integer>) s.clone();
//		System.out.println(s2.equals(s));
//		System.out.println(s2.equals(s3));
//		System.err.println(s.hashCode());
//		System.err.println(s2.hashCode());
//		System.err.println(s3.hashCode());
//		s.add(4, 30);
//		s.addElement(31);
//		for(int i=0;i<=s.indexOf(s.lastElement());i++) {
//			System.out.println("Elemnt at index "+i+":"+s.get(i));
//		}
		s.add(10);
		System.out.println("Current Capacity:"+s.capacity());
		System.out.println(s.indexOf(s.peek()));
		System.out.println("Search of peek:"+s.search(s.peek()));
		System.out.println("indexOf of peek:"+s.indexOf(s.peek()));
		Stack<Integer> s4= new Stack<Integer>();
		s4.add(0);
		s4.add(2);
		s4.add(3);
		System.out.println(s.containsAll(s4));
		Integer[] arr = new Integer[30] ;
		System.out.println(arr[0]);
		s.copyInto(arr);
		
		System.err.println("String".replace("xy", ""));
		
	}

}
