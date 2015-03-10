package collections;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsTest {
	
	
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ʈ��������");
		list.add("��Ÿ����");
		list.add("�����");
		list.add("��Ʈ����");
		
		System.out.println("sort��: " + list);
		
		Collections.sort(list);
		
		System.out.println("sort��: " + list);
		
		Collections.reverse(list);
		
		System.out.println("reverse��: " + list);
		
		int index = Collections.binarySearch(list, "��Ÿ����");
		System.out.println("��Ÿ����� " + index + "�� �ε����� ��ġ");
		
		/*
		Returns the index of the search key,
		if it is contained in the list;
		otherwise, (-(insertion point) - 1).
		The insertion point is defined
		as the point at which the key would be inserted into the list:
		the index of the first element greater than the key,
		or list.size() if all elements in the list are less than
		the specified key.
		Note that this guarantees that the return value will be >= 0
		if and only if the key is found.
		*/
	}
	
}
