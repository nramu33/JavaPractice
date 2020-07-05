package adt;

public class Counter {
	private String name =null;
	private int number = 0;
	Counter(String str){
		this.name=str;
	}
	void increment(){
		number++;
	}
	int getCurrentValue(){
		return this.number;

	}
	public String toString(){
		return name + " " +number; 

	}
}
