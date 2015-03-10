package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		System.out.println("head: " + list.getFirst());	// �� �� ������	(head)
		System.out.println("tail: " + list.getLast());		// �� �� ������ (tail)
		
		System.out.println("=== Iterator ===");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=== Iterator (reverse) ===");
		iter = list.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=== ListIterator ==="); // ����� Ž���� ������
		ListIterator<Integer> listIter = list.listIterator();
		if (listIter.hasNext()) {		// Ŀ�� �ڿ� ��Ұ� �ִ°�?
			listIter.next();
		}
		if (listIter.hasPrevious()) {	// Ŀ�� �տ� ��Ұ� �ִ°�?
			listIter.previous();
		}
		
	}
	
}
