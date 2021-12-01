package LinkedList;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
//		list.display();
//		list.addFirst(10);
//		list.display();
//		list.addFirst(20);
//		list.addFirst(30);
//		list.display();
//		list.addLast(50);
//		list.addLast(60);
//		list.display();
//		list.add(70, 3);
//		list.display();
//		System.out.println(list.get(3));
//		list.set(80, 4);
//		list.display();
////		list.removeFirst();
////		list.display();
////		list.remove(3);
////		list.display();
//		list.reversePR();
//		list.display();
		list.addLast(1);
		list.addLast(5);
		list.addLast(7);
		list.addLast(9);
		
		LinkedList list2 = new LinkedList();
		list2.addLast(2);
		list2.addLast(3);
		list2.addLast(6);
		list2.addLast(7);
		list2.addLast(10);
		list2.addLast(13);
		
		list.display();
		list2.display();
		LinkedList result = LinkedList.mergeSortedLL(list, list2);
		result.display();
		result.oddEven();
		result.display();
		result.reverseDR();
		result.display();
//		list.removeDuplicateInSortedLL();
//		list.display();
		
//		System.out.println(list.size());
	}

}
