package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(200);
		list1.add(1024);
		list1.add(-542);
		list1.add(200);
		
		int sum = 0;
		
		Iterator<Integer> iter = list1.iterator();	// ��� ���������� Ž���� �� �ִ� ��ü
													// Ŀ���� ù ��� �տ� ��ġ
													// JDK 1.2 ���� �����ϴ� Ŭ����
		while (iter.hasNext()) {
			Integer e = iter.next();
//			System.out.println(e);
			sum += e;
		}
		
//		for (int i = 0; i < list1.size(); i++) {
//			Integer e = iter.next();
//			sum += e;
//		}
		
		System.out.println("�հ�: " + sum);
		
		
		Vector<Integer> v1 = new Vector<Integer>();
		Enumeration<Integer> en = v1.elements();	// JDK 1.0 ���� �����ϴ� Ŭ����
		while (en.hasMoreElements()) {		// Iterator�� hasNext()
			Integer e = en.nextElement();	// Iterator�� next()
		}
		
	}
	
}

























