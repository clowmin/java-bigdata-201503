package inheritance.constructor;

public class B extends A {
	
	public B() {
		// super();	// �����Ϸ��� ���� �ڵ� ����
		super(1);	// ���� Ŭ���� ������ ȣ���� �������� ���� ù �ڵ尡 �Ǿ�� ��
		System.out.println("B�� ������ ȣ���");
	}
	
	public B(int a) {
		// super();
		super(a);	// A Ŭ������ �Ķ���� �ִ� �����ڸ� ��������� ȣ��
		System.out.println("B�� �Ķ���� �ִ� ������ ȣ���");
	}
	
}
