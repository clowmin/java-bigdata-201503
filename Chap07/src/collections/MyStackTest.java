package collections;

public class MyStackTest {
	
	public static void main(String[] args) {
		
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
		
	}
	
}
