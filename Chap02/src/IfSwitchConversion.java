import java.util.Scanner;	// <Ctrl> + <Shift> + O => �ڵ� ����Ʈ


public class IfSwitchConversion {
	
	public static void main(String[] args) {
		
		char grade;	// ����
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			
			int score = sc.nextInt();	// ����� �Է� ���ڿ��� int������
			
			int s = score / 10;
			
			if (s == 10 || s == 9) {
				grade = 'A';
			} else if (s == 8) {
				grade = 'B';
			} else if (s == 7) {
				grade = 'C';
			} else if (s == 6) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
//			switch (score / 10) {
//			case 10:
//			case 9:
//				grade = 'A';
//				break;
//			case 8:
//				grade = 'B';
//				break;
//			case 7:
//				grade = 'C';
//				break;
//			case 6:
//				grade = 'D';
//				break;
//			default:
//				grade = 'F';
//			}
			
			System.out.println("������ " + grade + "�Դϴ�.");
		}
		
		sc.close();	// Ű���� �Է� ��Ʈ�� �ڿ��� OS�� �ݳ�
	}
	
}
