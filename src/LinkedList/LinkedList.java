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
	
	public int size() {
		return this.size;
	}
	
	public Node addFirst(int data) {
		
		if(size == 0) {
			Node n = new Node(data, null);
			this.head = n;
			this.tail = n;
			this.size++;
			return n;
		}
		
		Node n = new Node(data, head);
		this.head = n;
		this.size++;
		return n;
	}
	
	public Node addLast(int data) {
		if(size == 0) {
			Node n = new Node(data, null);
			this.head = n;
			this.tail = n;
			this.size++;
			return n;
		}
		
		Node n = new Node(data, null);
		this.tail.next = n;
		this.tail = n;
		this.size++;
		return n;
		
	}
	
	public Node add(int data, int idx) {
		if(idx < 0 || idx > size) {
			return null;
		}
		if(idx == 0) {
			return addFirst(data);	
		} 
		Node temp = head;
		int i = 0;
		while(i < idx - 1) {
			temp = temp.next;
			i++;
		}
		Node n = new Node(data, temp.next);
		temp.next = n;
		size++;
		return n;
	}
	
	public int get(int idx) {
		if(idx < 0 || idx >= size) {
			return -1;
		}
		Node temp = head;
		int i = 0;
		while(i < idx) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}
	
	// O(n)
	public Node getNode(int idx) {
		if(idx < 0 || idx > size) {
			return null;
		}
		Node temp = head;
		int i = 0;
		while(i < idx) {
			temp = temp.next;
			i++;
		}
		return temp;		
	}
	
	public int set(int data, int idx) {
		Node target = getNode(idx);
		
		if(target == null) {
			return -1;
		}
		
		target.data = data;
		return data;
	}
	
	public Node removeFirst() {
		if(size == 0) {
			return null;
		}
		if(size == 1) {
			Node temp = head;
			size = 0;
			head = null;
			tail = null;
			size--;
			return temp;
		}
		Node temp = head;
		head = head.next;
		size--;
		return temp;
	}
	
	public Node remove(int idx) {
		if(idx < 0 || idx > size) {
			return null;
		}
		
		if(idx == 0) {
			return removeFirst();
		}
		Node targetNode = getNode(idx);
		Node n = getNode(idx - 1);
		n.next = n.next.next;
		size--;
		if(idx == size - 1) {
			
			tail = n;
		}
		return targetNode;
	}
	
	// O(n*n)
	public void reverseDI() {
		int l = 0;
		int r = size - 1;
		while(l < r) {
			Node lnode = getNode(l);
			Node rnode = getNode(r);
			
			int temp = lnode.data;
			lnode.data = rnode.data;
			rnode.data = temp;
			
			l++;
			r--;
		}
		swapHeadTail();
	}
	
	public void reversePI() {
		
		Node p = null, c = head, n;
		while(c != null) {
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		swapHeadTail();
	}
	
	public void reversePR() {
		reversePRHelper(head);
		swapHeadTail();
	}
	
	private void reversePRHelper(Node c) {
		if(c == tail) return;
		
		reversePRHelper(c.next);
		Node n = c.next;
		n.next = c;
		c.next = null;
		
	}
	
	public void swapHeadTail() {
		Node t = head;
		head = tail;
		tail = t;
	}
	
	public void display() {
		if(size == 0) return;
		
		Node temp = head;
		while(temp != tail) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(tail.data);	
	}
	
}
