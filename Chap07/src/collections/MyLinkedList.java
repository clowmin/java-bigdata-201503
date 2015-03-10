package collections;

public class MyLinkedList<E> /*implements java.util.List<E>*/ {
	
	static class Node<E> {
		E element;
		Node<E> next;	// ����Ʈ���� �� ��� ���� ����� �������� ������ ����
	}
	
	Node<E> head;	// ����Ʈ�� ù ��° ����� �������� ������ ����
	
	public void add(E e) {
		Node<E> newNode = new Node<E>();
		newNode.element = e;
		
		// ù ��° ������ ���ԵǴ� ���
		if (head == null) {
			head = newNode;
		} else {
			// ������ ��带 ã�Ƽ� �� �ڿ� �̾� �ٿ���..
			Node<E> current = head;
			while (current.next != null) {
				current = current.next;
			}
			// while���� ����� current�� ������ ��带 ����Ŵ
			current.next = newNode;
		}
	}
	
	public void add(int index, E e) {	// ���ο� �����͸� index ��ġ�� ����
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if (isEmpty()) {
			if (index == 0) {
				// �� �����͸� ����Ʈ�� ù ��° ��ġ�� ����
				Node<E> newNode = new Node<E>();
				newNode.element = e;
				head = newNode;
			} else {
				throw new ArrayIndexOutOfBoundsException(index);// ���� ��ü�� add �޼ҵ带 ȣ���� ������ ����
			}
		} else {
			try {
				Node<E> prevIthNode = head;
				for (int j = 0; j < index - 1; j++) {
					prevIthNode = prevIthNode.next;
				}
				// prevIthNode�� (index - 1) ��ġ�� ���
				
				Node<E> ithNode = prevIthNode.next;	// ������ index ��° ���
				
				// �� ������ ��带 ���� (index - 1)�� (index) ���̿� ����
				Node<E> newNode = new Node<E>();
				newNode.element = e;
				
				// index - 1�� next�� �� ����
				prevIthNode.next = newNode;
				// �� ����� next�� ������ index ����
				newNode.next = ithNode;
			} catch (NullPointerException ex) {
				throw new ArrayIndexOutOfBoundsException(index);
			}
		}
	}
	
	public boolean isEmpty() {
		return head == null;	// head�� null�̸� ����Ʈ�� ��� �ִ� ��
	}
	
	public E get(int i) {
		if (i < 0) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		if (isEmpty()) {	// ����Ʈ�� ����ִٴ� ���
//			throw new NoSuchElementException();
			throw new ArrayIndexOutOfBoundsException(i);
		} else {
			try {
				Node<E> ithNode = head;
				for (int j = 0; j < i; j++) {
					ithNode = ithNode.next;
				}
				return ithNode.element;
			} catch (NullPointerException e) {	// NullPointException�� �߻��� ��쵵 �߸��� �ε����� ������ ��
				throw new ArrayIndexOutOfBoundsException(i);
			}
		}
	}
	
	public int size() {	// ����Ʈ�� ����� �����Ͱ� �����?
		if (isEmpty()) {
			return 0;
		}
		
		int count = 1;
		Node<E> current = head;
		while (current.next != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
}

















