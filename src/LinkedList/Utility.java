package LinkedList;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.display();
		list.addFirst(10);
		list.display();
		list.addFirst(20);
		list.addFirst(30);
		list.display();
		list.addLast(50);
		list.addLast(60);
		list.display();
		list.add(70, 3);
		list.display();
		System.out.println(list.get(3));
		list.set(80, 4);
		list.display();
//		list.removeFirst();
//		list.display();
//		list.remove(3);
//		list.display();
		list.reversePR();
		list.display();
		
//		System.out.println(list.size());
	}

}
