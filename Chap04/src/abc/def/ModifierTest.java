package abc.def;

import abc.Book;	// �� Ŭ������ �ٸ� ��Ű���� ���� abc.Book Ŭ������ ������ ���ڴ�
					// �� import ������ ���� �� Ŭ�������� "Book"�̶�� �̸����� ���� Ŭ������
					// "abc.Book" Ŭ������ �ǹ�

public class ModifierTest extends Book {
	
	// �ʵ带 ���� �������� �ʾƵ�
	// ����� �޴´ٸ�, ���� Ŭ������ �ʵ�, �޼ҵ带 �����޾Ƽ� �ڱ� �� ó�� ��� ����
	
//	Book b = new Book();	// import�� ���� �ʾҴٸ�, Book�� abc.def.Book�� �ǹ�
//	abc.Book b1 = new abc.Book();
	
//	abc.def.Book b2 = new abc.def.Book();	// abc.Book�� import �ߴٸ�,
											// ���� ��Ű���� �ִ� Book�̶� full name�� ����� ��
	
	void test() {
		pub = 0;	// public
		pro = 1;	// protected => ���� ��Ű���̰ų�, ��Ӱ��迡�� ���� Ŭ�������Ը� ���� ���
//		def = 2;	// (default) => ���� ��Ű���� ��쿡�� ���� ���
//		pri = 3;	// private => �� Ŭ���� �������� ���� ����
	}
	
}
