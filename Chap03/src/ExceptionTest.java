import java.util.Scanner;


public class ExceptionTest {
	
	public static void main(String[] args) {
		
		String s = "1abc";
		int a = Integer.parseInt(s);	// ���ڿ��� int�� �ڷ�� ��ȯ
		System.out.println(a);
		
		/*
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("ù��° ��: ");
		a = sc.nextInt();
		
		System.out.print("�ι�° ��: ");
		b = sc.nextInt();
		
		try {
			System.out.println("ù��° �� / �ι�° �� = " + (a / b));
		} catch (ArithmeticException e) {
			// ArithmeticException Ÿ���� ���ܰ� �߻��ϸ� ������� ó���ϰڴ�
			System.out.println("����� ���� ��Ȳ�� �߻��߱���...");
		}
		// finally ������ ���� ����
		finally {
			// ���ܰ� �߻����� ���� ��,
			// �߻��� ��
			// ��� ��쿡 ������ ����
		}
		
		System.out.println("���α׷� ����");
		*/
	}
	
}
