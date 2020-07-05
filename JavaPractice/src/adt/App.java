package adt;

public class App {
	public static void main(String[] args) {
		Counter c1= new Counter("myCounter");
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		System.out.println(c1.getCurrentValue());
		
		
	}

}
