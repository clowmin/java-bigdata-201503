import java.util.Scanner;


public class BreakExam {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while (true) {
			if (sc.nextInt() == -1) {	// Ű����� �Է��� ���� -1�̶��
				break;	// �ݺ��� �ߴ�, while���� ��������
			}
			num++;
		}
		
		System.out.println("�Էµ� ������ ������ " + num + "���Դϴ�.");
		
		sc.close();
		
	}
	
}
