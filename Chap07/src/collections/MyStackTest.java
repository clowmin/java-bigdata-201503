package collections;

class Student {
	int id;	// �й�
	String name;	// �̸�
	
	public void sayName() {
		System.out.println(name);
	}
}

public class MyStackTest {
	
	public static void main(String[] args) {
		
		MyStack<Student> stack2 = new MyStack<Student>();
		
		Student s = new Student();
		s.id = 1000;
		s.name = "ȫ�浿";
		
		stack2.push(s);
		
		/*
		MyStack<String> stack1 = new MyStack<String>();
		
		stack1.push("�ѱ�");
		stack1.push("�Ϻ�");
		stack1.push("�̱�");
		stack1.push("�߱�");
		stack1.push("�븸");
		stack1.push("�ε�");
		stack1.push("������");
		stack1.push("����");
		
		System.out.println(stack1.pop());	// "����"
		System.out.println(stack1.pop());	// "������"
		System.out.println(stack1.pop());	// "�ε�"
		
		stack1.push("������ī");
		stack1.push("�̾Ḷ");
		stack1.push("�±�");
		stack1.push("�����");
		stack1.push("��Ʈ��");
		stack1.push("į�����");	// ������ ���Ŀ� push�߱� ������ ���õ�
		
		System.out.println(stack1.pop());
		*/
		
	}
	
}
