package collections;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("Grape");
		v1.add("Strawberry");
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Apple");
		list1.add("Mango");
		list1.add("Orange");
		
		// boolean addAll(Collection<> c)
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.addAll(list1);	// list1 ��ü�� ����� ��Ҹ� �Ѳ����� �߰�
		System.out.println(list2);
		
		list2.addAll(v1);	// v1 ��ü�� ����� ��Ҹ� �Ѳ����� �߰�
		System.out.println(list2);
		
		// clear() - ��� ��� ����
		list2.clear();
		System.out.println(list2);
		
		// boolean contains(Object o) - ���ڷ� ���޵� ��ü�� ���� ����
		System.out.println(list1.contains("Apple"));
		System.out.println(list1.contains("Grape"));
		
		// E get(int index) - index ��ġ�� �ִ� ��� ��ȸ
		System.out.println(list1.get(2));
		
		// int indexOf(Object o) - ���ڷ� ���޵� ��ü�� ��ġ(�ε���) ��ȸ
		int indexOfMango = list1.indexOf("Mango");	// ��ü�� ���� ��� -1 ����
		
		// boolean isEmpty() - ����Ʈ�� ��� �ִ��� ����
		boolean empty = list1.isEmpty();
		
		// E remove(int index) - index ��ġ�� �ִ� ��Ҹ� �����ϰ� �� ��Ҹ� ����
		String removedElement = list1.remove(1);
		
		// boolean remove(Object o) - ���ڷ� ���޵� ��ü�� ����Ʈ�� ���� �����ϰ�, ���� ���� ����
		boolean removed = list1.remove("Strawberry");
		
		// int size() - ����Ʈ�� ����� ����� ����
		int size = list1.size();
		
		// Object[] toArray() - ����Ʈ�� ����� ��ҵ��� Object �迭�� ����
		Object[] arr = list1.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// E[] toArray(E[] a)
		String[] strArr = new String[list1.size()];
		System.out.println("=== toArray �� ===");
		for (String s : strArr) {
			System.out.println(s);
		}
		
		list1.toArray(strArr);
		System.out.println("=== toArray �� ===");
		for (String s : strArr) {
			System.out.println(s);
		}
		
	}
	
}

















