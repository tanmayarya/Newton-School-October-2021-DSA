package LinkedList;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	private class Node {
		int data;
		Node next;
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public void addFirst(int data) {
		
		if(size == 0) {
			Node n = new Node(data, null);
//			n.data = data;
//			n.next = null;
			head = n;
			tail = n;
			this.size++;
			return;
		}
		
		Node n = new Node(data, head);
//		n.data = data;
//		n.next = head;
		head = n;
		this.size++;
	}
	
	public void display() {
		if(size == 0) return;
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
//		System.out.println(temp.data);	
	}
}
