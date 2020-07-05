package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList mylist = new CircularLinkedList();
		mylist.insertFirst(10);
		mylist.insertFirst(20);
		mylist.insertFirst(30);
		mylist.insertLast(40);
		mylist.insertLast(50);
		mylist.insertLast(60);
//		mylist.displayForward();
//		mylist.displayBackward();
		System.out.println(mylist.deleteFirst().data);
		mylist.deleteLast();
//		mylist.displayForward();
		mylist.deleteKey(20);
		mylist.displayForward();
		mylist.insertAfter(10, 15);
		mylist.displayForward();
		System.out.println(mylist.insertAfter(10, 35));
		

	}

}
