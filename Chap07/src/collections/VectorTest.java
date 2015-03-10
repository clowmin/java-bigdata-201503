package collections;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
//		System.out.println("�뷮: " + v.capacity());	// �ʱⰪ: 10
		
		System.out.println("������: " + v.size());
		
		v.add(new Integer(1));	// �ε��� 0�� ��ġ
		System.out.println("������: " + v.size());
		
		v.add(new Integer(3));	// �ε��� 1�� ��ġ
		System.out.println("������: " + v.size());
		
		v.add(5);				// �ε��� 2�� ��ġ
		System.out.println("������: " + v.size());
		
//		System.out.println(v);
		
		v.add(1, new Integer(7));	// �ε��� 1�� ��ġ�� ����
		System.out.println("������: " + v.size());
		
		System.out.println(v);
		
		Integer element = v.get(2);
		System.out.println(element);
		
		// ��� ����
		v.remove(0);
		System.out.println(v);
//		System.out.println(v.get(3));	// ���� �߻�
		
		v.firstElement();	// ù��° ��Ҹ� ��ȸ
		v.lastElement();	// ������ ��Ҹ� ��ȸ
		
		v.removeAllElements();	// ��� ��Ҹ� ����
		
		for (int i = 1; i <= 100; i++) {
			v.add(i);
			System.out.println(v + " (�뷮: " + v.capacity() + ")");
		}
		
		v.removeAllElements();	// ����� ��Ҹ� ����, �뷮�� �״�� ����
		
		System.out.println(v + " (�뷮: " + v.capacity() + ")");
		
	}
	
}
