package abc;

public class BookStore {
	
	Book b = new Book();
	
	void m() {
		// ���� ������ ��
		b.pub = 1;	// abc.Book�� public �������		// �ƹ���
		b.pro = 1;	// abc.Book�� protected �������	// ���� ��Ű��, ����Ŭ����
		b.def = 1;	// abc.Book�� (default) ��� ����	// ���� ��Ű��
//		b.pri = 1;	// abc.Book�� private ��� ����		// �ش� Ŭ���� ��������		// ���� �Ұ�
	}
	
}
