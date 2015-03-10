package collections;

public class MyStack<T> {
	
	Object[] stack;	// ���������� ���� ������ ����� �迭
//	T[] stack;
	int top = 0;	// ���� �����Ͱ� �� �迭 �ε���
	
	public MyStack() {
		this(10);
	}
	
	public MyStack(int capacity) {
		stack = new Object[capacity];	// ���� ����� �迭�� ����
//		stack = new T[capacity];
	}
	
	// ���ÿ� �����͸� ����
	public void push(T item) {
		if (top == stack.length)	// �� ������ ���� ����� �迭�� ������ ���
			return;
		
		stack[top++] = item;	// 1��° �����ʹ� stack[0]
								// 2��° �����ʹ� stack[1]
								// n��° �����ʹ� stack[n-1]
	}
	
	// �������κ��� �����͸� ����
	public T pop() {
		// ������ ��� �ִٸ�?
		if (top == 0)
			return null;
		
		top--;
		return (T) stack[top];
	}
}
























