import java.util.Scanner;

/*
 * ������ �Է� �ް� �Է� ���� �� ������ ������
 * �� �� �� ���ΰ��� ���ϴ� ���α׷�
 */
public class ArithmeticOperator {
	
	public static void main(String[] args) {
		
		int time;	// 3672 (1h 1m 12s)
		int second;	// 12
		int minute;	// 1
		int hour;	// 1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		
		time = sc.nextInt();	// ����ڰ� �Է��� ���ڿ��� int�� ������ ��ȯ�ؼ� time�� ����
		second = time % 60;
		minute = (time / 60) % 60;
		hour = time / 60 / 60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "�� �Դϴ�.");
	}
	
}
