
public class Garbage {
	
	String name;
	String[] dummy;
	
	public Garbage(String name) {
		this.name = new String(name);
		this.dummy = new String[10000];
		for (int i = 0; i < this.dummy.length; i++) {
			this.dummy[i] = new String("akshglkdhklghaslghalhdlsahhgalkh");
		}
	}
	public void finalize() {	// ��ü �Ҹ� ������ ȣ��Ǵ� �޼ҵ�
		System.out.println(this.name + " �Ҹ�");
	}
	
	public static void main(String[] args) {
		
		Garbage a = new Garbage("��üA");
		Garbage b = new Garbage("��üB");
		Garbage c = new Garbage("��üC");
		
		a = null;	// ��üA�� ���� ���۷����� ��� �����
		
		System.gc();	// ������ �÷��� ���� ��û
		
		Garbage d = c;	// ��üC�� ���� ���۷����� d�� �߰�
		
		c = null;	// ��üC�� ���� ���۷��� 1�� �����
		
		System.gc();	// ������ �÷��� ���� ��û
		
	}
	
}
