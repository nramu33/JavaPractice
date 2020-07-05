package ds.linkedlist1;

import java.io.*;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{
		Node new_node = new Node(data);
		new_node.next =null;
		if(list.head==null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	// Method to delet a new node 
		public static LinkedList deleteByKey(LinkedList list, int key) 
		{
			// Store head node 
	        Node currNode = list.head, prev = null;
	     // 
	        // CASE 1: 
	        // If head node itself holds the key to be deleted 
	  
			if(currNode!=null && currNode.data==key) {
				list.head = currNode.next;
				// Display the message 
	            System.out.println(key + " found and deleted");
	            return list;
			}
			// 
	        // CASE 2: 
	        // If the key is somewhere other than at head 
	        // 
			while(currNode!=null && currNode.data!=key) {
				prev = currNode;
				currNode = currNode.next;
			}
			if(currNode!=null) {
				prev.next =currNode.next;
				// Display the message 
	            System.out.println(key + " found and deleted"); 
			}
			
         // 
            // CASE 3: The key is not present 
            // 
      
            // If key was not present in linked list 
            // currNode should be null 
            if (currNode == null) { 
                // Display the message 
                System.out.println(key + " not found"); 
            } 
      
            // return the List 
            return list; 
		}
	// Method to print linked list
		public static void printList(LinkedList list) 
		{
			Node curreNode = list.head;
			while(curreNode!=null) {
				System.out.print(curreNode.data+" ");
				curreNode = curreNode.next;
			}
			
		}
	public static void main(String... args) {
		
		LinkedList list = new LinkedList(); 
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		printList(list);
		list = deleteByKey(list, 3);
		printList(list);
	}

}
