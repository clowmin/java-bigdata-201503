package inheritance.constructor.exam;

class A {
	
	int i;
	protected int j;
	private String name;
	public int k;
	
	public A() {
		
	}
	
	public A(int a) {
		
	}
	
	public A(int i, int j) {
		
	}
	
}

class B extends A {
	
}

public class TestMain {
	
	public static void main(String[] args) {
		
//		B b = new B(0);	// A Ŭ���� �����ڴ� B Ŭ������ ������ �ִ� �� ó�� ��� �Ұ�
//		
//		b.i = 1;	// A Ŭ���� ����� B Ŭ������ ������ �ִ� �� ó�� ��� ����
//		b.j = 2;
//		b.k = 3;
		
	}
	
}
