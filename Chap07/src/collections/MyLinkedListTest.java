package collections;

public class MyLinkedListTest {
	
	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));	// ���ܹ߻�!
		
		list.add(2, 5);	// 2�� �ε��� ��ġ�� �� ������ 5 ����
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		list.add(1, 6);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
		
		list.add(6, 7);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
//		System.out.println(list.get(6));
		
//		list.add(8, 8);	// 6�� �ε������� �����Ͱ� ����Ǿ� �ִ� ���¿���
						// 7���� �ǳʶٰ� 8�� �ε����� �����Ϸ��ϸ�
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
















