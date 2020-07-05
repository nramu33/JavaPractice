package ds.circularlinkedlist;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		first = null;
		last  = null;

	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()) {
			last=newNode;
		}
		else{
			first.previous = newNode;
		}

		newNode.next = first;
		this.first = newNode;		

	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first=newNode;
		}
		else {
			last.next = newNode;
			newNode.previous = last ;
		}
		last = newNode;
	}
	public Node deleteFirst() {
		Node temp =first;
		
		if(first.next == null) {
			last = null;
		}
		else {
			first.next.previous = null;//the list's first node will point null
		}
		first = first.next;
		return temp;

	}
	public Node deleteLast() {
		Node temp = last;
		
		if(first.next == null) {
			first = null;
		}
		else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(int key, int data) {
		Node current = first;
		
		while(current.data!=key) {
			current = current.next;
			if(current==null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		 
		if(current==last) {
			last = newNode;
		}else { 
			newNode.next = current.next;
			current.next.previous = newNode; 
		}
		newNode.previous = current;
		current.next = newNode;
		return true;
		 
	}

	public Node deleteKey(int key) {
		Node current = first;

		while(current.data!=key) {
			current = current.next;
			if(current==null) {
				return null;
			}
		}
		Node temp = current;

		if (current == first){
			first = current.next;
		}
		else {
			current.previous.next = current.next;
		}

		if (current == last){
			last = current.previous;
		}
		else {
			current.next.previous = current.previous;
		}
		return temp;
	}
	public void displayForward() {
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	public void displayBackward() {
		Node current = last;
		while(current!=null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}


}
