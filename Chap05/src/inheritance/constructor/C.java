package inheritance.constructor;

public class C extends B{
	
	public C() {
		// super();
		System.out.println("C ������ ȣ���");
	}
	
	public C(int a) {
		// super();
		super(a);	// ���� Ŭ������ �Ķ���� �ִ� �����ڸ� ��������� ȣ��
		System.out.println("C �Ķ���� �ִ� ������ ȣ���");
	}
	
}
