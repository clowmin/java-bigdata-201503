import java.util.Scanner;


public class WhileSample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double sum = 0;
		int i = 0;
		
		while ((i = sc.nextInt()) != 0) {	// ����ڰ� 0�� �Է����� �ʾҴٸ� ��� �ݺ�
			sum += i;	// ����� �Է� ���� ���� �հ�
			n++;	// ���ڰ� � �ԷµǾ����� ī��Ʈ
		}
		
		System.out.println("�Էµ� ���ڴ� �� " + n + "���̰�, ����� " + (sum / n) + "�Դϴ�.");
		
		
		
	}
	
}
